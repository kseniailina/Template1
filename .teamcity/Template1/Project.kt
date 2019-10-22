package Template1

import Template1.vcsRoots.*
import Template1.vcsRoots.Template1_HttpsGithubComKseniailinaTemplate1git
import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.Project
import jetbrains.buildServer.configs.kotlin.v2018_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2018_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "1f938430-0646-423d-8e74-5a894eb4c28a"
    id("Template1")
    parentId("_Root")
    name = "Template1"

    vcsRoot(Template1_HttpsGithubComKseniailinaTemplate1git)

    features {
        versionedSettings {
            id = "PROJECT_EXT_17"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = "${Template1_HttpsGithubComKseniailinaTemplate1git.id}"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
