pipeline {
    // any agents
    agent any

    // Triggers the job to poll the Git SCM every minute and check for changes
    triggers {
        pollSCM('* * * * *')  // Polling every minute for changes in the GitHub repository
        echo 'polling every minutes after a change commited to code'
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from GitHub repository
                checkout scm
                 echo 'Checking out Jenkins files'
            }
        }
        
        stage('Build') {
            steps {
                // Run Maven commands to build the project
                sh 'mvn clean install'
                echo 'Building the project'
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
