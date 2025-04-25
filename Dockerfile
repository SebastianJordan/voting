FROM eclipse-temurin:21-jdk AS build
COPY . /app
WORKDIR /app
RUN  ./mvnw  clean package
RUN mv -f target/*.jar app.jar
#Port 3000
FROM eclipse-temurin:21-jre
COPY --from=build /app/app.jar .
ARG PORT
ENV PORT=${PORT}
ENTRYPOINT [ "java", "-Dserver.port=${PORT}", "-jar", "app.jar" ]
