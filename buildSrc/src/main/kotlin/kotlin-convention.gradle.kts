import com.android.build.gradle.BaseExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

extensions.configure<BaseExtension>("android") {
	compileOptions {
		sourceCompatibility = Config.JAVA
		targetCompatibility = Config.JAVA
	}
}

tasks.withType<KotlinCompile>().configureEach {
	kotlinOptions {
		jvmTarget = Config.JAVA.toString()
	}
}