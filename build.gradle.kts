plugins {
    alias(libs.plugins.kotlin.jvm)
    application
}

application {
    mainClass.set("no.nav.MainKt")
    applicationName = "app"
}

kotlin {
    jvmToolchain(25)
}

dependencies {
    implementation(libs.bundles.ktor)
    implementation(libs.bundles.logging)

    testImplementation(platform(libs.junit.bom))
    testImplementation(libs.bundles.test)
}

tasks {
    withType<Test> {
        useJUnitPlatform()
        testLogging {
            showExceptions = true
        }
    }
}
