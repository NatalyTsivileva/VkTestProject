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
	implementation(project(Modules.CORE))
	implementation(project(Modules.DATABASE))
	implementation(project(Modules.TASK))

	implementation(Dependency.Ui.MATERIAL)
	implementation(Dependency.Hilt.JAVAPOET)


	kaptAndroidTest(Dependency.Hilt.HILT_KAPT)

	androidTestImplementation(Dependency.Testing.INSTRUMENTAL_RUNNER)
	androidTestImplementation(Dependency.Android.CORE_TEST)
	androidTestImplementation(Dependency.Hilt.TESTING)

	kapt(Dependency.Room.KOTLIN_KAPT)
	implementation(Dependency.Room.ROOM)
	implementation(Dependency.Room.COROUTINE_EXT)

	testImplementation(Dependency.Android.CORE_TEST)
	testImplementation(Dependency.Coroutines.COROUTINES_TEST)
	testImplementation(Dependency.Hilt.TESTING)
	testImplementation(Dependency.Testing.TURBINE)
}

hilt {
	enableAggregatingTask = true
}

