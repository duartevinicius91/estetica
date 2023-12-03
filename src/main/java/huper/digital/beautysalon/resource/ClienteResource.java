package huper.digital.beautysalon.resource;

import huper.digital.beautysalon.service.ClienteService;
import huper.digital.beautysalon.entity.ClienteEntity;
import io.quarkus.panache.common.Page;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.io.FileInputStream;
import java.nio.file.Files;
import java.util.List;
import java.util.UUID;

@Path("/cliente")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClienteResource {


    private final ClienteService service;

    public ClienteResource(ClienteService service) {
        this.service = service;
    }

    @GET
    @Path("{id}")
    public ClienteEntity get(@PathParam("id") Long id){
        ClienteEntity clienteEntity = service.get(id);
        if (clienteEntity == null) {
            throw new WebApplicationException(404);
        }
        return clienteEntity;
    }

    @GET
    public List<ClienteEntity> list(@QueryParam("page") @DefaultValue("0") int pageIndex,
                                     @QueryParam("size") @DefaultValue("20") int pageSize) {
        return service.list(Page.of(pageIndex, pageSize));
    }

    @Transactional
    @POST
    public ClienteEntity add(ClienteEntity newCliente) {
        return service.add(newCliente);
    }

    public static final String HTML = """
        <html>
        <head>
            <style>
        		<!-- put your css here -->
            </style>
        </head>
        <body>
            <div class="container" style="padding-top: 100px;">
                <div class="row justify-content-center">
                    <div class="col-md-6">
                        <table class="table table-bordered">
                            <thead class="thead-light">
                                <tr>
                                    <th>Name</th>
                                    <th>Address</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>$name</td>
                                    <td>$address</td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </body>
        </html>
        """;

//    @GET
//    @Path("/pdf")
//    @Produces(MediaType.APPLICATION_OCTET_STREAM)
//    public Response extractTextFromPdf() throws BadRequestException {
//        try {
//            java.nio.file.Path tempFile = Files.createTempFile(LocalDateTime.now().toString(), ".pdf");
//            FileOutputStream pdfStream = new FileOutputStream(tempFile.toFile());
//            HtmlConverter.convertToPdf(HTML, pdfStream);
//
//            Response.ResponseBuilder response = Response.ok(tempFile.toFile());
//            response.header("Content-Disposition", "attachment;filename=" + tempFile);
//            return response.build();
//        }
//        catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//    }

    @GET
    @Path("/pdf")
    @Produces("application/pdf")
    public Response generateReport(@QueryParam(value = "name") String name,
                                               @QueryParam(value = "address") String address) throws Exception {
        String uuid = UUID.randomUUID().toString();
        java.nio.file.Path pathHtml = Files.createTempFile(uuid,  ".html");
        java.nio.file.Path pathPdf = Files.createTempFile(uuid,  ".pdf");

        try {
            // read the template and fill the data
            String htmlContent = HTML;
            htmlContent = htmlContent.replace("$name", name)
                .replace("$address", address);

            // write to html
            Files.write(pathHtml, htmlContent.getBytes());

            // convert html to pdf
            Process generateToPdf = Runtime.getRuntime().exec("wkhtmltopdf " + pathHtml.toString() + " " + pathPdf.toString() );
            generateToPdf.waitFor();

            System.out.println(pathHtml);
            System.out.println(pathPdf);
            // deliver pdf

            return Response.ok(new FileInputStream(pathPdf.toFile()))
                .type("application/pdf")
                .header("Content-Disposition",  "filename=restfile.pdf")
                .build();


        } finally {
            // delete temp files
//            Files.delete(pathHtml);
//            Files.delete(pathPdf);
        }
    }

}
