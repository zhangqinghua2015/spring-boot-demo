FROM openjdk:8-alpine
# COPY ./chat-front.jar /tmp/chat-front.jar
EXPOSE 8901
ENTRYPOINT java -jar spring-boot-demo.jar
