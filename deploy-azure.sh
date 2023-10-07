docker build -f src/main/docker/Dockerfile.native-micro -t duartevinicius91/teste .
docker run -p 8080:8080 duartevinicius91/teste
#docker login -u duartevinicius91 -p winnY1607
#docker push duartevinicius91/teste
#az containerapp up \
#  --name my-container-app \
#  --resource-group my-container-apps \
#  --location centralus \
#  --environment 'my-container-apps' \
#  --image docker.io/duartevinicius91/teste:latest \
#  --target-port 8080 \
#  --min-replicas 0 \
#  --ingress external \
#  --query properties.configuration.ingress.fqdn