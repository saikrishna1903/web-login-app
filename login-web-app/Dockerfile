FROM java:8

EXPOSE 9001

ADD target/login-web-app-0.01-SNAPSHOT.jar loginapp.jar

ENTRYPOINT ["java","-jar","loginapp.jar"]