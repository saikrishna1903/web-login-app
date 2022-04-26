FROM java:8

EXPOSE 9001

ADD target/login-web-app-0.0.1-SNAPSHOT.jar loginapp.jar

ENTRYPOINT ["java","-jar","loginapp.jar"]