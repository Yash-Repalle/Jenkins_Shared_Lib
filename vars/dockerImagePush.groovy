def call(String project, String tag, String user){

    withCredentials([usernamePassword(credentialsId: 'docker-hub', passwordVariable: 'pass', usernameVariable: 'username')]) {
    sh "docker login -u '$username' -p '$pass'"
    }
    sh "docker image push ${user}/${project}:${tag}"
}