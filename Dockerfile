#pull base image
FROM openjdk:8-jdk-alpine

VOLUME /tmp

#maintainer 
LABEL maintainer="nagraj.rj@gmail.com"

#expose port 8080
EXPOSE 8080

#RUN bash -c 'touch /app.jar'

#default command
CMD java -jar /k8s-springbootapp-0.0.1-SNAPSHOT.jar

#copy hello world to docker image   
ADD ./target/k8s-springbootapp-0.0.1-SNAPSHOT.jar /k8s-springbootapp-0.0.1-SNAPSHOT.jar

#ENTRYPOINT ["java", "-Dspring.data.mongodb.uri=mongodb://mongodb:27017/testdb","-Djava.security.egd=file:/dev/./urandom","-jar","/k8s-springbootapp-0.0.1-SNAPSHOT.jar"]
