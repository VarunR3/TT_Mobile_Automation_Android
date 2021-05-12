pipeline {
    agent{
        label 'linux'
    }
    options{
    		ansiColor('xterm')
    		timestamps()
    }

    environment {
        SLACK_CHANNEL = 'C014PBSTU00' //tech-builds-automation
    }
    stages {
        stage('Build'){

            agent {
                label 'linux'
            }
            steps{
                githubNotify status: "PENDING", context: "jenkins: tt-mobile-automation", description: "Build started"
                sh 'docker run --rm -v ${PWD}:/usr/src/mymaven -w /usr/src/mymaven maven:3-alpine mvn test'
                sh 'docker run --rm -v ${PWD}:/usr/src/mymaven -w /usr/src/mymaven maven:3-alpine mvn compile'
                sh 'docker run --rm -v ${PWD}:/usr/src/mymaven -w /usr/src/mymaven maven:3-alpine mvn package'
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }
    post {
        success {
           slackSend channel: SLACK_CHANNEL,
           color: 'good',
           message: "SUCCESSFUL: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' (${env.BUILD_URL})"
           githubNotify status: "SUCCESS", context: "jenkins: tt-mobile-automation", description: "Build succeeded"
        }
        failure {
            // make it to match the Jenkins function not tt
            slackSend channel: SLACK_CHANNEL,
            failOnError: true,
            message: "Build Started: ${env.JOB_NAME} ${env.BUILD_NUMBER}"
            githubNotify status: "FAILURE", context: "jenkins: tt-mobile-automation", description: "Build failed"
        }

        //clean
        always {
                sh 'sudo rm -rf target'
        }
    }
}

