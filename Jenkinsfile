pipeline {
  agent any
  stages {
    stage('pre-build-checks') {
      steps {
        validateDeclarativePipeline 'Jenkinsfile'
        isUnix()
        script{
            if(true){
                println 'hello'
            }
        }
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