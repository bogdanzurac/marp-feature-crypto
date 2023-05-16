import dev.bogdanzurac.marp.feature.crypto.projects
import dev.bogdanzurac.marp.feature.crypto.useArtifacts

plugins {
    alias(libs.plugins.marp.feature.ui)
    alias(libs.plugins.marp.publishing)
}

project.ext {
    group = "dev.bogdanzurac.marp"
    version = "0.0.1"
}

android {
    namespace = "dev.bogdanzurac.marp.feature.crypto.ui"
}

dependencies {
    implementation(libs.marp.core.auth)
    implementation(
        if (useArtifacts) libs.marp.feature.crypto.domain
        else project(projects.featureCryptoDomain)
    )
    implementation(
        if (useArtifacts) libs.marp.feature.crypto.ui.common
        else project(projects.featureCryptoUiCommon)
    )
    implementation(libs.marp.feature.notes.domain)
    implementation(libs.marp.feature.notes.ui.common)
}
