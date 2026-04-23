pipeline {
    agent any

    tools {
        maven 'Maven3'
    }

    stages {

        stage('Checkout') {
            steps {
                echo 'Cloning repository...'
                git branch: 'search-result',
                    url: 'https://github.com/shrutibargale29/Devops_Project'
            }
        }

        stage('Clean') {
            steps {
                echo 'Cleaning old build...'
                sh 'mvn clean'
            }
        }

        stage('Compile') {
            steps {
                echo 'Compiling source code...'
                sh 'mvn compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging application...'
                sh 'mvn package -DskipTests'
            }
        }

    }

    post {
        success {
            echo 'BUILD SUCCESS - JAR is ready in target/ folder!'
        }
        failure {
            echo 'BUILD FAILED - Check console output!'
        }
    }
}
