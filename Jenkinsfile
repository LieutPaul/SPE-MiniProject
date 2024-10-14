pipeline{
    environment{
        DOCKERHUB_CRED = credentials("dockerhub_id")
        PATH = "/opt/homebrew/bin:$PATH" 
    }
    agent any
    stages{
        
        stage("Stage 1: Maven Build and Test"){
            steps{
                sh 'mvn clean install'
            }
        }
        
        stage("Stage 2: Build Docker Image"){
            steps{
                sh "docker build -t vikaskaly/spe-miniproject-calculator:latest ."
            }
        }
        
        stage("Stage 3: Push Docker Image to Dockerhub"){
            steps{
                sh 'echo $DOCKERHUB_CRED_PSW | docker login -u $DOCKERHUB_CRED_USR --password-stdin'
                sh "docker push vikaskaly/spe-miniproject-calculator:latest"
            }
        }
        
        stage("Stage 4: Clean Unwanted Docker Images"){
            steps{
                sh "docker container prune -f"
                sh "docker image prune -a -f"
            }
        }
        
        stage('Stage 5: Ansible Deployment') {
            steps {
                sh "ansible-playbook -i inventory deploy-calculator.yml"
            }
        }
        

    }
}

// Docker: /usr/local/bin/docker
// Maven: /opt/homebrew/bin/mvn
