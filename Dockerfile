FROM openjdk:11-jre
#ADD build/libs/demo.jar demo.jar
EXPOSE 8989
ENTRYPOINT ["java","-jar","demo.jar"]