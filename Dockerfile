# Usando a imagem oficial do OpenJDK 21
FROM eclipse-temurin:21-jdk-alpine

# Diretório dentro do container onde a aplicação vai morar
WORKDIR /app

# Copiar o JAR gerado pelo Maven para dentro do container
COPY target/*.jar app.jar

# Expor a porta que a aplicação vai rodar (default Spring Boot)
EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java","-jar","app.jar"]
