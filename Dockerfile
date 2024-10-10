FROM openjdk:8-alpine
# COPY ./chat-front.jar /tmp/chat-front.jar
EXPOSE 9002
ENTRYPOINT java -jar spring-boot-demo.jar
