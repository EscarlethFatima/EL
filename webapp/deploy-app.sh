echo 'Stopping Tomcat service...'
echo "${tomcat_webapps}/${war_name}.war"
sudo systemctl stop tomcat
sudo rm -f "${tomcat_webapps}/${war_name}.war"
sudo rm -rf "${tomcat_webapps}/${war_name}""

echo 'Moving war file...'
sudo cp -f /tmp/"${war_name}.war" "${tomcat_webapps}/${war_name}.war"
sudo rm /tmp/"${war_name}.war"

echo 'Starting Tomcat service...'
sudo systemctl start tomcat
