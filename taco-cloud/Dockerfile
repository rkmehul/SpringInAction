FROM openjdk:17-jdk
EXPOSE 8080
USER root
COPY taco-cloud-0.0.1-20231116.103602-3.jar /home/root/app.jar 
ENTRYPOINT ["java","-jar","/home/root/app.jar"]