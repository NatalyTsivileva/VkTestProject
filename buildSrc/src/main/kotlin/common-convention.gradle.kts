apply(plugin = Plugins.ANDROID_KOTLIN)
apply(plugin = Plugins.CONVENTION_APP_CONFIG)
apply(plugin = Plugins.CONVENTION_BUILD_TYPES)
apply(plugin = Plugins.CONVENTION_KOTLIN)

dependencies {
	"implementation"(Dependency.Android.CORE)
	"implementation"(Dependency.Compat.APP_COMPAT)

	"testImplementation"(Dependency.Testing.JUNIT)

	"androidTestImplementation"(Dependency.Testing.JUNIT_EXT)
}

