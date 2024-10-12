pipelineJob('HelloLinux') {
    description('''A sample pipeline job for Hello-Linux project.'''.stripIndent())

    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/mmanu-prasad/kube-man.git')
                    }
                    branch('main')
                }
            }
            scriptPath('Jenkinsfile')
        }
    }
}
