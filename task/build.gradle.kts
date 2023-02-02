plugins {
	id(Plugins.LIBRARY)
	id(Plugins.COMMON_CONVENTIONS)
}

android {
	namespace = "com.tsivileva.task"

	viewBinding.isEnabled = true
}

dependencies {
	implementation(project(Modules.CORE))
	implementation(project(Modules.DATABASE))

	implementation(Dependency.Room.ROOM)

	implementation(Dependency.ViewModel.VIEW_MODEL)

	implementation(Dependency.Ui.MATERIAL)

	implementation(Dependency.ViewModel.LIVECYCLE)

}


hilt {
	enableAggregatingTask = true
}
