pipeline ('Hello'){
    agent any

    stages {
        stage('Checkout') {
            steps {
              sh 'echo "hello 1"'
            }
        }
        stage('Build') {
            steps {
                // Build the project
                 sh 'echo "hello 2"'
            }
        }
        stage('Test') {
            steps {
                // Run tests
             sh 'echo "hello 2"'
            }
        }
        stage('Deploy') {
            steps {
                // Deploy the application
               sh 'echo "hello 3"'
            }
        }
    }
}
