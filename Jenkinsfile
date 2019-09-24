node {
  try {
    stage('start-docker') {
      sh "docker run -dt --name replica gcr.io/s2-kubeflow-master-249419/replica-docker:latest tail -f /dev/null"
    }
    stage('user-commands') {
      echo "first stage of the container..."
      sh "docker exec -i replica ls -l"
      sh "docker ps"
      sh "docker iamges"
    }
  } finally {
    stage('cleanup') {
      echo "doing some cleanup..."
      sh "docker stop container replica"
      sh "docker rm images gcr.io/s2-kubeflow-master-249419/replica-docker:latest"
    }
  }
}
