pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building project...'
                sh 'javac AddResult.java'
            }
        }

        stage('Run') {
            steps {
                echo 'Running program...'
                sh 'java AddResult'
            }
        }
    }
}