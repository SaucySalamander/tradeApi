pipeline {
  agent any
  stages {
    stage('Pre-Build Checks') {
      steps {
        isUnix()
        pwd(tmp: true)
      }
    }
  }
}