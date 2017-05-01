buildscript {
    val SPRING_BOOT_VERSION = "1.5.3.RELEASE"
    val KOTLIN_VERSION = "1.1.2"
    extra["KOTLIN_VERSION"] = KOTLIN_VERSION

    repositories {
        mavenCentral()
        jcenter()
        maven { setUrl("https://oss.sonatype.org/content/repositories/snapshots") }
    }

    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:$SPRING_BOOT_VERSION")
        classpath("org.jetbrains.kotlin:kotlin-noarg:$KOTLIN_VERSION")
        classpath("org.jetbrains.kotlin:kotlin-allopen:$KOTLIN_VERSION")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$KOTLIN_VERSION")
    }
}

val VERSION = "0.0.1-SNAPSHOT"
val KOTLIN_VERSION = extra["KOTLIN_VERSION"]
val JUNIT_JUPITER_VERSION = "5.0.0-SNAPSHOT"
val JUNIT_PLATFORM_VERSION = "1.0.0-SNAPSHOT"
val ASSERTJ_CORE_VERSION = "3.6.2"
val sourceCompatibility = 1.8
val targetCompatibility = 1.8

apply {
    plugin("kotlin")
    plugin("kotlin-spring")
    plugin("kotlin-jpa")
    plugin("org.springframework.boot")
}


repositories {
    mavenCentral()
    jcenter()
    maven { setUrl("https://oss.sonatype.org/content/repositories/snapshots") }
}

dependencies {
    compile("org.springframework.boot:spring-boot-starter-web")
    compile("org.springframework.boot:spring-boot-starter-data-jpa")
    compile("com.h2database:h2")
    compile("org.jetbrains.kotlin:kotlin-stdlib:$KOTLIN_VERSION")
    compile("org.jetbrains.kotlin:kotlin-reflect:$KOTLIN_VERSION")
    compile("com.fasterxml.jackson.module:jackson-module-kotlin:2.8.4")

    testCompile("org.junit.jupiter:junit-jupiter-api:$JUNIT_JUPITER_VERSION")
    testRuntime("org.junit.jupiter:junit-jupiter-engine:$JUNIT_JUPITER_VERSION")
    testCompile("org.junit.platform:junit-platform-runner:$JUNIT_PLATFORM_VERSION")
    testCompile("org.assertj:assertj-core:$ASSERTJ_CORE_VERSION")
    testCompile("org.springframework.boot:spring-boot-starter-test")

}
