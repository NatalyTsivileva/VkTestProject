plugins {
	id(Plugins.LIBRARY)
	id (Plugins.COMMON_CONVENTIONS)
}

android {
	namespace = "com.tsivileva.feature_create_task"
}


dependencies {
	implementation(Dependency.Ui.MATERIAL)
}