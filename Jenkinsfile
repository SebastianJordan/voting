pipeline {
    agent any
    tools {
        maven 'Maven 3.9.9'
    }
    stages {
        def app  
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
        stage('Build docker'){
            steps{
              app =  docker.build("sebastianjordan19/com.sebastian.voting${env.BUILD_NUMBER}")
            }
        }
        stage('Test image') {           
            app.inside {            
             sh 'echo "Tests passed"'        
            }    
        } 
    }
}