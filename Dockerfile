FROM tomcat:8-jre8
#https://github.com/docker-library/tomcat

##ADD ./target/*.war $CATALINA_HOME/webapps/
COPY ./MyDevPipeline.war /usr/local/tomcat/webapps/

EXPOSE 8080
##CMD ["catalina.sh", "run"]