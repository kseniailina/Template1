package Teamplate1_Template1.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.vcs.GitVcsRoot

object Teamplate1_Template1_HttpsGithubComKseniailinaTemplate1gitRefsHeadsMaster : GitVcsRoot({
    uuid = "230207c6-e1f8-4818-a44e-642ca88b6bf2"
    name = "https://github.com/kseniailina/Template1.git#refs/heads/master"
    url = "https://github.com/kseniailina/Template1.git"
    authMethod = password {
        userName = "kseniailina"
        password = "credentialsJSON:a5ae659c-6d5b-4aa8-a98c-6de895ba289e"
    }
})
