FROM openjdk:17-jdk
EXPOSE 8080
USER root
COPY taco-cloud-1.0-20231118.021922-4.jar /home/root/app.jar 
ENTRYPOINT ["java","-jar","/home/root/app.jar"]