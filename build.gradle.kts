// 插件
plugins {
    kotlin("multiplatform") version "1.9.22"
}

// 包名
group = "com.example"
// 版本号
version = "1.0-SNAPSHOT"

// 发布
kotlin {
    // jvm发布目标
    jvm {}

    js {}

    sourceSets {
        commonMain {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }
        jvmMain {
            dependencies {
                implementation(kotlin("stdlib-jdk8"))
            }
        }
        jsMain {
            dependencies {
                implementation(kotlin("stdlib-js"))
            }
        }
    }
}

