# How To deploy a Java Web Site to Heroku Cloud
## Requirements and Configurations Heroku ToolBelt
* Download and install the Heroku Tool Belt  from  link:   

        https://s3.amazonaws.com/assets.heroku.com/heroku-toolbelt/heroku-toolbelt.exe

* Create account on Heroku with below signup link: 

        https://signup.heroku.com/dc 

* Open Command Prompt and login on Heroku with the next command:

        heroku login

## Create Java Web Application with Maven 
* Create a sample java web site  with the help of maven using command:

         mvn archetype:generate -DarchetypeArtifactId=maven-archetype-webapp

    It will ask for project group id,artifactid and pakaging type as shown below
        
        [INFO] Generating project in Interactive mode
        Define value for property 'groupId': : com.example
        Define value for property 'artifactId': : demoapp
        Packaging type war
        packaging type 'war' can be deployed to java server like tomcat.
  
## If you already have Web Application  then convert it to maven
* Simply convert it to maven application by creating a pom.xml file init.

## Webapp Runner
  
  * Webapp Runner allows you to launch an application in a Tomcat container that has a JRE installed. 
  * No previous steps to install Tomcat are required when using Webapp Runner. 
  * It’s just a jar file that can be executed and configured using the java command.
	
## Configure maven to download Webapp Runner
     <plugin>
          <groupId>org.apache.maven.plugins</groupId>
          <artifactId>maven-dependency-plugin</artifactId>
          <version>2.3</version>
          <executions>
              <execution>
                   <phase>package</phase>
                   <goals><goal>copy</goal></goals>
                   <configuration>
                       <artifactItems>
                           <artifactItem>
                       <groupId>com.github.jsimone</groupId>
                       <artifactId>webapp-runner</artifactId>
                           <version>8.0.30.2</version>
                   <destFileName>webapp-runner.jar</destFileName>
                           </artifactItem>
                       </artifactItems>
                   </configuration>
              </execution>
          </executions>
     </plugin>


## Deploy website  to Heroku
* Create a Procfile:

    - Declare how you want your application executed in Procfile in the project root
	- Create this file with a single line:
			
            web:java $JAVA_OPTS -jar target/dependency/webapp-runner.jar --port $PORT target/*.war
* Commit your changes to Git 
* Create the app with the next comand:

         heroku create demowebsite
* It will show message like this:

        Creating demowebsite... done, stack is cedar-14
        http://demowebsite.herokuapp.com/ | git@heroku.com:demowebsite.git

## Deploy the code:

        git push heroku master
* The application is now deployed. Ensure that the instance of the app is running:

        heroku ps:scale web=1
* The application should now be up and running on Heroku. Open it in your browser with:

        heroku open
