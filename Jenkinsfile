pipeline {
  agent any
  stages {
    stage('pre-build-checks') {
      steps {
        validateDeclarativePipeline 'Jenkinsfile'
        isUnix()
        sh 'pwd'
      }
    }
    stage('build image') {
       steps {
        script{
            app = docker.build("saucysalamander/tradeapi")
        }
       }
    }
    stage('publish image') {
      steps {
        script{
        docker.withRegistry('https://registry.hub.docker.com', 'docker-hub-creds')
        app.push('0.1')
      }
      }
    }
    stage('post-build-checks') {
      steps {
        sh 'ls -la ./build/libs'
      }
    }
  }
}