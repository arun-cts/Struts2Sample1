FROM openjdk:8-jdk-alpine

VOLUME /tmp

COPY target/Struts2Example-0.0.1.war Struts2Example-0.0.1.war

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/Struts2Example-0.0.1.war"]
