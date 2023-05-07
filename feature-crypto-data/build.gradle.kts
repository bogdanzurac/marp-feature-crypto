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
    implementation(libs.marp.feature.crypto.domain)
}