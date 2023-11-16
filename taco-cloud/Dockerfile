FROM openjdk:17-jdk
EXPOSE 8080
USER root
COPY taco-cloud-1.0-20231116.142230-1.jar /home/root/app.jar 
ENTRYPOINT ["java","-jar","/home/root/app.jar"]