plugins {
	id(Plugins.LIBRARY)
	id(Plugins.COMMON_CONVENTIONS)
}

android {
	namespace = "com.tsivileva.feature_tasklist"
}

dependencies {
	implementation(Dependency.Ui.MATERIAL)
}
