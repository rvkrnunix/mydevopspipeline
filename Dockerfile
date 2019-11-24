### vi Dockerfile
# Pull base image
FROM tomcat:8-jre8
# copy war file on to container
COPY ./MyDevPipeline.war /usr/local/tomcat/webapps
##CMD ["catalina.sh", "run"]