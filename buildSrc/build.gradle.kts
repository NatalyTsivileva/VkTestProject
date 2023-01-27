import org.gradle.kotlin.dsl.`kotlin-dsl`

plugins {
	`kotlin-dsl`
}


repositories {
	google()
	mavenCentral()
}

dependencies {
	//Версия должна быть такая же как в Versions.kt
	"implementation"("com.android.tools.build:gradle:7.3.1")

	//Версия должна быть такая же как в Versions.kt
	"implementation"("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.20")

}