package Teamplate1_Template1

import Teamplate1_Template1.buildTypes.*
import Teamplate1_Template1.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.Project

object Project : Project({
    uuid = "54d9da87-cc10-4799-8ad3-776fbd82c502"
    id("Teamplate1_Template1")
    parentId("Teamplate1")
    name = "Template1"

    vcsRoot(Teamplate1_Template1_HttpsGithubComKseniailinaTemplate1gitRefsHeadsMaster)

    buildType(Teamplate1_Template1_Build)
})
