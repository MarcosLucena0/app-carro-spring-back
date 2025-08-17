# ======= 1. Build do projeto usando Maven =======
FROM maven:3.9.1-jdk-21 AS build

WORKDIR /app

# Copia pom.xml e src
COPY pom.xml .
COPY src ./src

# Build do JAR
RUN mvn clean package -DskipTests

# ======= 2. Imagem final para rodar o JAR =======
FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]
