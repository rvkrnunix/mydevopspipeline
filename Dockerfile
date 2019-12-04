FROM java:8-jre
#https://github.com/docker-library/tomcat

###RUN mkdir -p "$CATALINA_HOME"
COPY ./MyDevPipeline.war /usr/local/tomcat/webapps/
EXPOSE 8080
CMD ["catalina.sh", "run"]