FROM openjdk:8-alpine
RUN mkdir /home/app
COPY ./spring-boot-demo.jar /home/app/spring-boot-demo.jar
EXPOSE 8901
ENTRYPOINT java -jar /home/app/spring-boot-demo.jar
