def gitdownload(repo)
{
  git "https://github.com/Ak-1920/${repo}.git"
}
def mavenbuild()
{
  sh "mvn package"
}
