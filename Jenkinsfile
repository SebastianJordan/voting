pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                script {
                    checkout scm
                }
            }
        }

        stage('Build and Test') {
            steps {
                script {
                    sh 'mvnnw clean package'
                }
            }
        }

        stage('Build') {
            steps {
                script {
                    sh 'echo "funciona"'
                }
            }
        }
    }
}