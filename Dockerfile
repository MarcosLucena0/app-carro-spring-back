# Etapa 1: Construção com Maven e JDK 21
FROM maven:3.9.8-eclipse-temurin-21 AS build

WORKDIR /app

# Copiar arquivos do projeto
COPY pom.xml .
COPY src ./src

# Construir o projeto
RUN mvn clean package -DskipTests

# Etapa 2: Imagem para execução com JDK 21
FROM openjdk:21

WORKDIR /app

# Copiar o JAR gerado
COPY --from=build /app/target/*.jar app.jar

# Expor a porta
EXPOSE 8080

# Comando para iniciar a aplicação
CMD ["java", "-jar", "app.jar"]

