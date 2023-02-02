object Dependency {


	object Android {
		private const val CORE_VERSION = "1.9.0"
		private const val CORE_TEST_VERSION = "2.1.0"

		const val CORE = "androidx.core:core-ktx:$CORE_VERSION"
		const val CORE_TEST = "androidx.arch.core:core-testing:${CORE_TEST_VERSION}"
	}

	object Compat {
		private const val COMPAT_VERSION = "1.6.0"
		const val APP_COMPAT = "androidx.appcompat:appcompat:$COMPAT_VERSION"
	}

	object Ui {
		private const val MATERIAL_VERSION = "1.7.0"
		private const val CONSTRAINT_LAYOUT_VERSION = "2.1.4"

		const val MATERIAL = "com.google.android.material:material:$MATERIAL_VERSION"
		const val CONSTRAINT_LAYOUT =
			"androidx.constraintlayout:constraintlayout:$CONSTRAINT_LAYOUT_VERSION"
	}

	object Navigation {
		private const val NAVIGATION_VERSION = "2.5.3"

		const val FRAGMENT = "androidx.navigation:navigation-fragment-ktx:$NAVIGATION_VERSION"
		const val UI = "androidx.navigation:navigation-ui-ktx:$NAVIGATION_VERSION"
	}

	object ViewModel {
		private const val LIFECYCLE_VERSION = "2.5.1"

		val VIEW_MODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:$LIFECYCLE_VERSION"
		val LIVE_DATA = "androidx.lifecycle:lifecycle-livedata-ktx:$LIFECYCLE_VERSION"
		val LIVECYCLE = "androidx.lifecycle:lifecycle-runtime-ktx:$LIFECYCLE_VERSION"
	}

	object Room {
		private const val ROOM_VERSION = "2.5.0"

		const val ROOM = "androidx.room:room-runtime:$ROOM_VERSION"
		const val ANNOTATION_PROCESSOR = "androidx.room:room-compiler:$ROOM_VERSION"

		const val KOTLIN_KAPT = "androidx.room:room-compiler:$ROOM_VERSION"

		const val COROUTINE_EXT = "androidx.room:room-ktx:$ROOM_VERSION"
	}

	object Hilt {
		const val HILT = "com.google.dagger:hilt-android:${Versions.HILT_VERSION}"
		const val HILT_KAPT = "com.google.dagger:hilt-android-compiler:${Versions.HILT_VERSION}"
		const val JAVAPOET = "com.squareup:javapoet:${Versions.JAVAPOET_VERSION}"

		const val TESTING = "com.google.dagger:hilt-android-testing:${Versions.HILT_VERSION}"
	}

	object Coroutines {
		const val COROUTINES_VERSION = "1.6.4"

		const val COROUTINES =
			"org.jetbrains.kotlinx:kotlinx-coroutines-android:${COROUTINES_VERSION}"

		const val COROUTINES_TEST =
			"org.jetbrains.kotlinx:kotlinx-coroutines-test:${COROUTINES_VERSION}"

	}

	object Testing {
		private const val JUNIT_VERSION = "4.13.2"
		private const val JUNIT_EXT_VERSION = "1.1.5"
		private const val ESPRESSO_CORE_VERSION = "3.5.1"
		private const val INSTRUMENTAL_RUNNER_VERSION = "1.4.0"
		private const val TURBINE_VERSION ="0.12.1"

		const val JUNIT = "junit:junit:$JUNIT_VERSION"
		const val JUNIT_EXT = "androidx.test.ext:junit:$JUNIT_EXT_VERSION"
		const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:$ESPRESSO_CORE_VERSION"
		const val INSTRUMENTAL_RUNNER = "androidx.test:runner:${INSTRUMENTAL_RUNNER_VERSION}"
		const val TURBINE ="app.cash.turbine:turbine:${TURBINE_VERSION}" //for Flow testing
	}

}