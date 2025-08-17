# ======= 1. Build do projeto usando Maven =======
FROM maven:3.9.1-eclipse-temurin-21 AS build

WORKDIR /app

# Copia o pom.xml e a pasta src
COPY pom.xml .
COPY src ./src

# Build do JAR (pula testes para acelerar)
RUN mvn clean package -DskipTests

# ======= 2. Imagem final para rodar o JAR =======
FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

# Copia o JAR do estágio de build
COPY --from=build /app/target/*.jar app.jar

# Porta padrão do Spring Boot
EXPOSE 8080

# Comando para iniciar a aplicação
ENTRYPOINT ["java","-jar","app.jar"]

