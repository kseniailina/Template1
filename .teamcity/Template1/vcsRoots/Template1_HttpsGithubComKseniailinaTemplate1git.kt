package Template1.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.vcs.GitVcsRoot

object Template1_HttpsGithubComKseniailinaTemplate1git : GitVcsRoot({
    uuid = "4aec770c-8743-4ce5-8686-16f17673a73f"
    name = "https://github.com/kseniailina/Template1.git"
    url = "https://github.com/kseniailina/Template1.git"
    authMethod = password {
        userName = "kseniailina"
        password = "credentialsJSON:a5ae659c-6d5b-4aa8-a98c-6de895ba289e"
    }
})
