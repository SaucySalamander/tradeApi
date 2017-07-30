pipeline {
  agent any
  stages {
    stage('pre-build-checks') {
      steps {
        validateDeclarativePipeline 'Jenkinsfile'
        isUnix(println isUnix())
        sh 'pwd'
      }
    }
    stage('pre-build') {
       steps {
         sh './gradlew clean'
       }
    }
    stage('build') {
      steps {
        sh './gradlew build'
      }
    }
    stage('post-build-checks') {
      steps {
        sh 'ls -la ./build/libs'
      }
    }
  }
}