### vi Dockerfile
# Pull base image
From tocat:8-jre8

#Copy war file to tomcat

COPY ./MyDevPipeline.war /usr/local/tocat/webapps