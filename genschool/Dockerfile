# Usando uma imagem base com Maven e JDK
FROM maven:3.8.4-openjdk-17 AS build

# Diretório de trabalho
WORKDIR /app

# Copie o arquivo pom.xml e baixe as dependências
COPY pom.xml .
RUN mvn dependency:go-offline

# Copie o código-fonte e construa o JAR
COPY src ./src
RUN mvn clean package

# Usando uma imagem base mais leve para rodar o JAR
FROM openjdk:17-jdk-slim

# Diretório de trabalho
WORKDIR /app

# Copie o JAR do estágio de build
COPY --from=build /app/target/genschool-0.0.1-SNAPSHOT.jar /app/genschool.jar

# Comando para rodar o JAR
CMD ["java", "-jar", "/app/genschool.jar"]
