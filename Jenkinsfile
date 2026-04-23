pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Compiling required Java files...'
                sh 'javac AddResult.java DataStore.java Student.java DisplayResult.java'
            }
        }

        stage('Run') {
            steps {
                echo 'Running AddResult...'
                sh 'java AddResult'
            }
        }
    }
}