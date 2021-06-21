pluginManagement {
    val kotlinVersion: String by settings
    val ktLintPluginVersion: String by settings

    val springBootPluginVersion: String by settings
    val springDependencyManagementPluginVersion: String by settings

    plugins {
        id("org.jetbrains.kotlin.plugin.spring") version kotlinVersion
        id("org.jlleitschuh.gradle.ktlint") version ktLintPluginVersion

        id("org.springframework.boot") version springBootPluginVersion
        id("io.spring.dependency-management") version springDependencyManagementPluginVersion
    }
}

rootProject.name = "dev-pref-test"
include("app")
