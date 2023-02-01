package com.tsivileva.vktodolist.rules

import android.content.Context
import androidx.room.Room
import androidx.test.platform.app.InstrumentationRegistry
import com.tsivileva.database.AppDatabase
import org.junit.rules.TestWatcher
import org.junit.runner.Description

class DatabaseTestRules : TestWatcher() {
	var database: AppDatabase? = null

	override fun starting(description: Description) {
		super.starting(description)
		val context = InstrumentationRegistry.getInstrumentation().context
		database = createInMemoryDatabase(context)
	}

	override fun finished(description: Description) {
		super.finished(description)
		database?.close()
		database = null
	}

	private fun createInMemoryDatabase(context: Context) =
		Room.inMemoryDatabaseBuilder(context, AppDatabase::class.java)
			.allowMainThreadQueries()
			.build()

}