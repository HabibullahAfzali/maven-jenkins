pipeline {
    agent any

    // Triggers the job to poll the Git SCM every minute and check for changes
    triggers {
        pollSCM('* * * * *')  // Polling every minute for changes in the GitHub repository
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from GitHub repository
                checkout scm
            }
        }
        
        stage('Build') {
            steps {
                // Run Maven commands to build the project
                sh 'mvn clean install'
            }
        }
    }

    post {
        // Send notifications or archive artifacts if the build succeeds or fails
        success {
            echo 'Build succeeded'
        }
        failure {
            echo 'Build failed'
        }
    }
}
