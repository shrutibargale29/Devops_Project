pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Compiling all Java files...'
                sh 'javac *.java'
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