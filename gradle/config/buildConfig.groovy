binaryRepository {
    baseUrl = 'http://localhost:8081/artifactory'
    releaseUrl = "$baseUrl/libs-release-local"
    username = 'admin'
    password = 'password'
}


environments {
    test {
        server {
            hostname = '192.168.2.33'
            sshPort = 22
            //port = 8099
            port = 8080
            context = 'todo'
            //username = 'manager'
            username = 'vagrant'
            password = 'manager'
        }
    }

    uat {
        server {
            hostname = 'localhost'
            sshPort = 22
            port = 8199
            context = 'todo'
            username = 'manager'
            password = 'manager'
        }
    }

    production {
        server {
            hostname = 'localhost'
            sshPort = 22
            port = 8299
            context = 'todo'
            username = 'manager'
            password = 'manager'
        }
    }
}