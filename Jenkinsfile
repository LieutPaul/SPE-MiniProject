pipeline{
    environment{
        DOCKERHUB_CRED = credentials("dockerhub_id")
    }
    agent any
    stages{
        
        stage("Stage 1 : Maven Build"){
            steps{
                sh 'mvn clean install'
            }
        }
        
        stage("Stage 2 : Build Docker Image"){
            steps{
                sh "docker build -t vikaskaly/SPE-MiniProject-Calculator:latest ."
            }
        }
        
        stage("Stage 3 : Push Docker Image to Dockerhub"){
            steps{
                sh 'echo $DOCKERHUB_CRED_PSW | docker login -u $DOCKERHUB_CRED_USR --password-stdin'
                sh "docker push vikaskaly/SPE-MiniProject-Calculator:latest"
            }
        }
        
        stage("Stage 4 : Clean Unwanted Docker Images"){
            steps{
                // sh "docker ps -a -q | xargs docker stop | xargs docker rm"
                // sh "docker rm -f ${docker ps -a -q}"
                sh "docker container prune -f"
                sh "docker image prune -a -f"
            }
        }
        
        // stage('Stage 6 : Ansible Deployment') {
        //     steps {
        //         ansiblePlaybook colorized: true,
        //         credentialsId: 'localhost',
        //         installation: 'Ansible',
        //         inventory: 'inventory',
        //         playbook: 'Deploy-Calculator.yml'
        //     }
        // }
        //

    }
}