### vi Dockerfile
# Pull base image
From tomcat:8-jre8

# copy war file on to container
COPY ./MyDevPipeline.war /usr/local/tomcat/webapps/