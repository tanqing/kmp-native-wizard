//pluginManagement {
//    repositories {
//        mavenCentral()
//        gradlePluginPortal()
//    }
//}

rootProject.name = "KotlinNativeTemplate"

pluginManagement {
    repositories {
        maven(
            url = "http://172.16.1.225:8081/repository/maven-public/",
            action = {
                isAllowInsecureProtocol = true
            }
        )
        gradlePluginPortal()
        mavenCentral()
    }
}