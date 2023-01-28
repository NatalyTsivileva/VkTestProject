plugins {
	id(Plugins.LIBRARY)
	id(Plugins.COMMON_CONVENTIONS)
	id(Plugins.KOTLIN_KAPT)
}

android {
	namespace = "com.tsivileva.database"
}

dependencies {
	implementation(project(Modules.CORE))

	implementation(Dependency.Room.ROOM)
	implementation(Dependency.Room.COROUTINE_EXT)

    kapt(Dependency.Room.KOTLIN_KAPT)

    annotationProcessor(Dependency.Room.ANNOTATION_PROCESSOR)
}
