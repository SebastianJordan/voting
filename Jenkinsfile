pipeline {
    agent any
    tools {
       'org.jenkinsci.plugins.docker.commons.tools.DockerTool' '18.09'
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
        stage('exist docker') {
            steps {
                script {
                    sh 'docker version'
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
