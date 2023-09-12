def call(String project, String tag, String user){

    sh """
        trivy image ${user}/${project}:${tag} > scan.txt
        cat scan.txt
    """
}