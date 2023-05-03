def call(String project, String hubUser) {
    sh "docker image build -t ${hubUser}/${project} ."
    sh "docker tag ${hubUser}/${project} ${hubUser}/${project}:${ImageTag}"
    sh "docker tag ${hubUser}/${project} ${hubUser}/${project}:latest"
    sh "sudo docker login -u pavanraj97 -p Seeramdas@1997"
    sh "docker image push ${hubUser}/${project}:${ImageTag}"
    sh "docker image push ${hubUser}/${project}:latest"
}
