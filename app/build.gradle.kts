plugins {
	id(Plugins.ANDROID_APPLICATION)
	id(Plugins.COMMON_CONVENTIONS)
}

android {
	namespace = "com.tsivileva.vktodolist"

	defaultConfig {
		applicationId = "com.tsivileva.vktodolist"
		versionCode = Config.VERSION_CODE
		versionName = Config.VERSION_NAME
	}
}

dependencies {
	implementation(Dependency.Ui.MATERIAL)
}
