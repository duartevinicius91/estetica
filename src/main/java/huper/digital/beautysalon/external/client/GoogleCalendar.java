package huper.digital.beautysalon.external.client;

//import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
//import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
//import com.google.api.client.http.HttpTransport;
//import com.google.api.client.json.JsonFactory;
//import com.google.api.client.json.jackson2.JacksonFactory;
//import com.google.api.services.calendar.Calendar;
//import com.google.api.services.calendar.CalendarScopes;
//import com.google.api.services.calendar.model.Event;
//import com.google.api.services.calendar.model.Events;
//
//import java.io.IOException;
//import java.security.GeneralSecurityException;
//import java.util.Collections;
//import java.util.List;

public class GoogleCalendar {
//    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
//    private static final String APPLICATION_NAME = "Google Calendar Integration";
//    private static final List<String> SCOPES = Collections.singletonList(CalendarScopes.CALENDAR);
//
//    private Calendar service;
//
//    public GoogleCalendar(String credentialsFilePath) throws IOException, GeneralSecurityException {
//        HttpTransport httpTransport = GoogleNetHttpTransport.newTrustedTransport();
//        GoogleCredential credential = GoogleCredential.fromStream(
//                        GoogleCalendar.class.getResourceAsStream(credentialsFilePath))
//                .createScoped(SCOPES);
//
//        service = new Calendar.Builder(httpTransport, JSON_FACTORY, credential)
//                .setApplicationName(APPLICATION_NAME)
//                .build();
//    }
//
//    public Event createEvent(String summary, String startDateTime, String endDateTime) throws IOException {
//        Event event = new Event();
//        event.setSummary(summary);
//
//        EventDateTime start = new EventDateTime();
//        start.setDateTime(startDateTime);
//        event.setStart(start);
//
//        EventDateTime end = new EventDateTime();
//        end.setDateTime(endDateTime);
//        event.setEnd(end);
//
//        return service.events().insert("primary", event).execute();
//    }
//
//    public List<Event> getEvents(int maxResults) throws IOException {
//        Events events = service.events().list("primary")
//                .setMaxResults(maxResults)
//                .setOrderBy("startTime")
//                .setSingleEvents(true)
//                .execute();
//
//        return events.getItems();
//    }
}
