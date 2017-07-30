pipeline {
    agent any
    stages {
        stage('pre-build-checks') {
            steps {
                sh './gradlew clean'
                sh './gradlew build'
                sh 'ls -la ./build/libs'
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
        stage('post-build-checks'){
            steps{
                sh 'ls -la ./build/libs'
            }
        }
    }
}