pipeline {  
    agent any  
    stages {  
        stage("git_checkout") {  
            steps {  
                echo "cloning repository" 
                echo "repo cloned successfully"  
                }  
            }
        stage('Build and Test') {
            agent {
                docker { image 'maven:3-jdk-8' }
            }
            steps {
                sh 'mvn clean install'
            }
        }
    }
}