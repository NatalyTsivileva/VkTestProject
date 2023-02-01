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
	implementation(project(Modules.DATABASE))

	implementation(Dependency.Ui.MATERIAL)
	implementation(Dependency.Hilt.JAVAPOET)

}

hilt {
	enableAggregatingTask = true
}

