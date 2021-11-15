FROM java:8

EXPOSE 8080

ADD target/basic-sb-k8s.jar basic-sb-k8s.jar

ENTRYPOINT ["java", "-jar","basic-sb-k8s.jar"]