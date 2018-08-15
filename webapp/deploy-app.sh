echo 'Stopping Tomcat service...'

sudo systemctl stop tomcat
sudo rm -f /opt/tomcat/webapps/webapp.war
sudo rm -rf /opt/tomcat/webapps/webapp

echo 'Moving war file...'
sudo cp -f /tmp/webapp.war /opt/tomcat/webapp.war
sudo rm /tmp/webapp.war

echo 'Starting Tomcat service...'
sudo systemctl start tomcat
