pipeline {
  agent any
  stages {
    stage('Checkout Code') {
      steps {
        git(url: 'https://github.com/rogeriods/test-jenkins.git', branch: 'main')
      }
    }

    stage('Run Test') {
      steps {
        sh 'mvn test'
      }
    }

  }
}