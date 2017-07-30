pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh './gradlew clean'
                sh './gradlew build'
                sh 'ls -la ./build/libs'
            }
        }
    }
}