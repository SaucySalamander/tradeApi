pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh './gradlew clean'
                sh './gradlew build'
                sh 'cd ./build/libs'
                sh 'ls -la'
            }
        }
    }
}