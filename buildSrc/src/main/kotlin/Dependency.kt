object Dependency {


	object Android {
		private const val CORE_VERSION = "1.9.0"
		const val CORE = "androidx.core:core-ktx:$CORE_VERSION"
	}

	object Compat {
		private const val COMPAT_VERSION = "1.6.0"
		const val APP_COMPAT = "androidx.appcompat:appcompat:$COMPAT_VERSION"
	}

	object Ui {
		private const val MATERIAL_VERSION = "1.7.0"
		private const val CONSTRAINT_LAYOUT_VERSION = "2.1.4"

		const val MATERIAL = "com.google.android.material:material:$MATERIAL_VERSION"
		const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:$CONSTRAINT_LAYOUT_VERSION"
	}

	object Navigation {
		private const val NAVIGATION_VERSION = "2.5.3"

		const val FRAGMENT = "androidx.navigation:navigation-fragment-ktx:$NAVIGATION_VERSION"
		const val UI = "androidx.navigation:navigation-ui-ktx:$NAVIGATION_VERSION"
	}

	object ViewModel{
		private const val LIFECYCLE_VERSION = "4.13.2"

		val VIEW_MODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:$LIFECYCLE_VERSION"
	}

	object Testing {
		private const val JUNIT_VERSION = "4.13.2"
		private const val JUNIT_EXT_VERSION = "1.1.5"
		private const val ESPRESSO_CORE_VERSION = "3.5.1"

		const val JUNIT = "junit:junit:$JUNIT_VERSION"
		const val JUNIT_EXT = "androidx.test.ext:junit:$JUNIT_EXT_VERSION"
		const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:$ESPRESSO_CORE_VERSION"
	}

}