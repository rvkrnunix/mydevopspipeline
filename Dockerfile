FROM java:8-jre
#https://github.com/docker-library/tomcat
COPY ./MyDevPipeline.war /usr/local/tomcat/webapps/
ENV CATALINA_HOME /usr/local/tomcat
ENV PATH $CATALINA_HOME/bin:$PATH

RUN mkdir -p "$CATALINA_HOME"
WORKDIR $CATALINA_HOME

# see https://www.apache.org/dist/tomcat/tomcat-8/KEYS


EXPOSE 8080
##CMD ["catalina.sh", "run"]