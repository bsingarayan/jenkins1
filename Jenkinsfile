node {
  try {
    stage('start-docker') {
      sh "docker run -dt --name replica circleci/python:3.6.4 tail -f /dev/null"
    }
    stage('user-commands') {
      echo "first stage of the container..."
      sh "docker exec -i replica echo hello world"
    }
  } finally {
    stage('cleanup') {
      echo "doing some cleanup..."
      sh "docker stop replica"
      sh "docker rm replica"
      sh "docker image rm circleci/python:3.6.4"
    }
  }
}
