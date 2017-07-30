pipeline {
  agent any
  stages {
    stage('pre-build') {
      steps {
        isUnix()
        pwd()
        validateDeclarativePipeline 'Jenkinsfile'
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