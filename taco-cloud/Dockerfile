FROM openjdk:17-jdk
EXPOSE 8080
USER root
COPY taco-cloud-0.0.1-20231116.101303-2.jar /home/root/app.jar 
ENTRYPOINT ["java","-jar","/home/root/app.jar"]