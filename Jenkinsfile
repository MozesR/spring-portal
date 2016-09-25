// tell Jenkins how to build projects from this repository
node {
	try {
		
		stage 'Checkout'
		git url: 'https://github.com/MozesR/spring-portal.git'
		def mvnHome = tool 'M3'
			
		stage 'Build'
		sh "${mvnHome}/bin/mvn -Dmaven.test.failure.ignore clean package"
		
	} catch (e) {
		slackSend color: 'danger', message: "Build Failed - ${env.JOB_NAME} ${env.BUILD_NUMBER} (<${env.BUILD_URL}|Open>)"
		throw e
	} finally {
		step([$class: 'JUnitResultArchiver', testResults: '**/target/TestRest-*.xml'])
	}
}