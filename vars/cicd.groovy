def gitdownload(repo)
{
  git "https://github.com/Ak-1920/${repo}.git"
}
def mavenbuild()
{
  sh 'mvn package'
}
def deploy(jobname,ip,appname)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}
def runSelenium(jobname)
{
sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
}

