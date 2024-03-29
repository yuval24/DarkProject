plugins {
    id("java-library")
}


java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

dependencies {
    implementation("com.google.code.gson:gson:2.8.8")
    implementation("org.postgresql:postgresql:42.2.5")
    implementation(project(":sharedmodule"))
}



