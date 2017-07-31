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
         app = docker.build("./")
       }
    }
    stage('publish image') {
      steps {
        docker.withRegistry('https://registry.hub.docker.com', 'docker-hub-creds')
        app.push('0.1')
      }
    }
    stage('post-build-checks') {
      steps {
        sh 'ls -la ./build/libs'
      }
    }
  }
}