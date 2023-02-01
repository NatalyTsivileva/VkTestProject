import com.android.build.gradle.BaseExtension
import org.jetbrains.kotlin.gradle.plugin.KaptExtension

apply(plugin = Plugins.ANDROID_KOTLIN)
apply(plugin = Plugins.CONVENTION_APP_CONFIG)
apply(plugin = Plugins.CONVENTION_BUILD_TYPES)
apply(plugin = Plugins.CONVENTION_KOTLIN)
apply(plugin=Plugins.HILT)
apply(plugin=Plugins.KOTLIN_KAPT)

dependencies {
	"implementation"(Dependency.Android.CORE)
	"implementation"(Dependency.Compat.APP_COMPAT)

	"testImplementation"(Dependency.Testing.JUNIT)

	"testImplementation"(Dependency.Testing.JUNIT_EXT)
	"androidTestImplementation"(Dependency.Testing.JUNIT_EXT)


	"implementation"(Dependency.Hilt.HILT)

	"kapt"(Dependency.Hilt.HILT_KAPT)
}
