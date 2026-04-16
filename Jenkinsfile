pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                echo 'Cloning repository...'
            }
        }

        stage('Build') {
            steps {
                echo 'Building project...'
                sh 'javac AddModule.java'   // change file name if needed
            }
        }

        stage('Run') {
            steps {
                echo 'Running program...'
                sh 'java AddModule'
            }
        }
    }
}