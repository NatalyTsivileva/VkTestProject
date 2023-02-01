import org.gradle.kotlin.dsl.`kotlin-dsl`
import org.jetbrains.kotlin.gradle.plugin.KaptExtension

plugins {
	`kotlin-dsl`
}


repositories {
	google()
	mavenCentral()
}

dependencies {
	//Версия должна быть такая же как в Versions.kt:
	implementation("com.android.tools.build:gradle:7.3.1")
	implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.20")
	implementation("com.squareup:javapoet:1.13.0")
}
