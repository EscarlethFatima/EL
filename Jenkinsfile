pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
	        sh '''
		chmod +x quickstart/gradlew
		./quickstart/gradlew clean assemble -p quickstart/
		'''
            }
	    post {
        	success {
           	  archiveArtifacts artifacts: 'quickstart/build/libs/*.jar', fingerprint: true
        	}
   	    }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
	        sh './quickstart/gradlew clean test jacocoTestReport -p quickstart/'
            }
	    post {
        	always {
           	   junit 'quickstart/build/test-results/test/*.xml'
		   publishHTML([allowMissing: true,
                       alwaysLinkToLastBuild: false,
                       keepAll: true,
                       reportDir: 'quickstart/build/reports/tests/test',
                       reportFiles: 'index.html',
                       reportTitles: "Test Report",
                       reportName: 'Junit Report'])
		  publishHTML([allowMissing: true,
                       alwaysLinkToLastBuild: false,
                       keepAll: true,
                       reportDir: 'quickstart/build/reports/jacoco/test/html',
                       reportFiles: 'index.html',
                       reportTitles: "Jacoco Report",
                       reportName: 'Jacoco CodeCoverage Report'])
        	}
   	    }
        }
    }
}
