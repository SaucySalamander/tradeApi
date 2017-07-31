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
    stage('pre-build'){
        steps {
            sh './gradlew clean'
        }
    }
    stage('build-jar'){
        steps{

            sh './gradlew build'

            sh 'pwd'
        }
    }
    stage('build image') {
       steps {
       sh 'pwd'
        script{
            app = docker.build("saucysalamander/tradeapi")
        }
       }
    }
    stage('publish image'){
    steps{
        docker.withRegistry("https://registry.hub.docker.com", docker-hub-creds) {

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