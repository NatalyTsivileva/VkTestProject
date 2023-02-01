plugins {
	id(Plugins.LIBRARY)
	id(Plugins.COMMON_CONVENTIONS)
}

android {
	namespace = "com.tsivileva.task"
}

dependencies {
	implementation(project(Modules.CORE))
	implementation(project(Modules.DATABASE))

	implementation(Dependency.Room.ROOM)

	implementation(Dependency.ViewModel.VIEW_MODEL)

	implementation(Dependency.Ui.MATERIAL)
}


hilt {
	enableAggregatingTask = true
}
