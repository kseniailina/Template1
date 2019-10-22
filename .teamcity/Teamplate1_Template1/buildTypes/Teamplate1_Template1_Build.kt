package Teamplate1_Template1.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.triggers.vcs

object Teamplate1_Template1_Build : BuildType({
    uuid = "53ca9493-e999-4715-ab52-37f3ca2f5604"
    name = "Build"

    vcs {
        root(Teamplate1_Template1.vcsRoots.Teamplate1_Template1_HttpsGithubComKseniailinaTemplate1gitRefsHeadsMaster)
    }

    triggers {
        vcs {
        }
    }
})
