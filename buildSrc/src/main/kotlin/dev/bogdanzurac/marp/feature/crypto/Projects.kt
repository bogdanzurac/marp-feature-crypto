package dev.bogdanzurac.marp.feature.crypto

object projects {
    const val featureCryptoDomain = ":feature-crypto-domain"
    const val featureCryptoUiCommon = ":feature-crypto-ui-common"
}

val useArtifacts: Boolean
    get() = System.getProperty("useArtifacts").toBoolean()