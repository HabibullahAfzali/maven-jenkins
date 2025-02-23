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
                echo 'Polling every minute after a change is committed to the repository'
                checkout scm
                echo 'Checking out the repository code'
            }
        }
        
        stage('Build') {
            steps {
                // Run Maven commands to build the project
                echo 'Starting the Maven build: clean install'
                sh 'mvn clean install'
                echo 'Maven build completed'
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
