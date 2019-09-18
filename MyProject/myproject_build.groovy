// MyProject-Build.groovy

def gitUrl = "https://github.com/bsingarayan/jenkins-pipes-helloworld.git"

job("MyProject-Build") {
    description "Builds MyProject from master branch."
    parameters {
        stringParam('COMMIT', 'HEAD', 'Commit to build')
    }
    scm {
        git {
            remote {
                url gitUrl
                branch "origin/master"
            }
            extensions {}
        }
    }
    steps {
        shell "Look: I'm building master!"
    }
}
