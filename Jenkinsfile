pipeline {
    agent any
    tools {
        maven 'Maven 3.9.9'
    }
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
                    sh 'mvn clean package'
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
        stage('print ls') {
            steps {
                script {
                    sh 'ls'
                }
            }
        }
        stage('Build docker') {
            steps {
                script {
                    docker.build('sebastianjordan19/com.sebastian.api:0.0.1', '.')
                }
            }
        }
    }
}
