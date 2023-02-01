plugins {
	id(Plugins.LIBRARY)
	id(Plugins.KOTLIN_KAPT)
	id(Plugins.COMMON_CONVENTIONS)
}

android {
	namespace = "com.tsivileva.database"
}

dependencies {
	implementation(project(Modules.CORE))

	kapt(Dependency.Room.KOTLIN_KAPT)
	implementation(Dependency.Room.ROOM)
	implementation(Dependency.Room.COROUTINE_EXT)
}


hilt {
	enableAggregatingTask = true
}
