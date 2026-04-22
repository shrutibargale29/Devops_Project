pipeline {
agent any

```
tools {
    maven 'Maven'     // Must match Jenkins tool name
    jdk 'Java'        // Must match Jenkins tool name
}

stages {

    stage('Checkout') {
        steps {
            // If using Git, Jenkins will auto checkout
            echo 'Code checkout stage'
        }
    }

    stage('Build') {
        steps {
            echo 'Building project...'
            sh 'mvn clean compile'
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
            sh 'mvn package'
        }
    }
}

post {
    success {
        echo 'BUILD SUCCESS ✅'
    }
    failure {
        echo 'BUILD FAILED ❌'
    }
}
```

}
