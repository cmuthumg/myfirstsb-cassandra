FROM java:8

EXPOSE 8080

ADD target/sb-cassandra-k8s.jar sb-cassandra-k8s.jar

ENTRYPOINT ["java", "-jar","sb-cassandra-k8s.jar"]