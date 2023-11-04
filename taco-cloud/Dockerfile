FROM openjdk:8-jdk
EXPOSE 8080
USER root
COPY ./target/demo-0.0.1-SNAPSHOT.jar /home/root/app.jar 
ENTRYPOINT ["java","-jar","/home/root/app.jar"]