import com.android.build.gradle.BaseExtension

extensions.configure<BaseExtension>("android") {
	compileSdkVersion(Config.COMPILE_SDK)

	defaultConfig {
		minSdk = Config.MIN_SDK
		targetSdk = Config.TARGET_SDK
		testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
		consumerProguardFiles("consumer-rules.pro")
	}
}