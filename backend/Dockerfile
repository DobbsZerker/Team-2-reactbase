FROM openjdk:8-alpine
COPY target/springBootTeam2-1.0.0.jar /app.jar
#RUN "mvn install"
EXPOSE 8095
ENTRYPOINT ["java","-jar","app.jar", "--server.port=8095"]