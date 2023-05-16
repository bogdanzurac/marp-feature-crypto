import dev.bogdanzurac.marp.feature.crypto.projects
import dev.bogdanzurac.marp.feature.crypto.useArtifacts

plugins {
    alias(libs.plugins.marp.feature.data)
    alias(libs.plugins.marp.publishing)
}

project.ext {
    group = "dev.bogdanzurac.marp"
    version = "0.0.1"
}

android {
    namespace = "dev.bogdanzurac.marp.feature.crypto.data"
}

dependencies {
    implementation(
        if (useArtifacts) libs.marp.feature.crypto.domain
        else project(projects.featureCryptoDomain)
    )
}