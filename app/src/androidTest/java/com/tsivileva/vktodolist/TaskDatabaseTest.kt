package com.tsivileva.vktodolist

import android.graphics.Color
import com.tsivileva.core.data.Undefined
import com.tsivileva.database.entities.TaskEntity
import com.tsivileva.vktodolist.rules.DatabaseTestRules
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@HiltAndroidTest
class TaskDatabaseTest {


	@get:Rule
	var hiltRule = HiltAndroidRule(this)


	@get:Rule
	var databaseRule = DatabaseTestRules()

	@Before
	fun init() {
		hiltRule.inject()
	}

	private val dao
		get() = databaseRule.database?.taskDao()

	@Test
	fun testTaskAdding(): Unit = runBlocking {
		val expectedId = 1283L

		val task = TaskEntity(
			id = expectedId,
			name = "testText",
			description = "",
			creationTime = 100L,
			textColor = Color.RED,
			status = Undefined
		)

		val actualId = dao?.addTask(task)

		Assert.assertEquals(expectedId, actualId)
	}

	@Test
	fun testTaskListAdding(): Unit = runBlocking {
		val expectedCount = 10
		val expectedTaskList = createTaskList(expectedCount)

		val actualCount = dao?.addTaskList(expectedTaskList)?.count() ?: 0

		Assert.assertEquals(expectedCount, actualCount)
	}


	private fun createTaskList(count: Int) = (0 until count).map {
		TaskEntity(
			name = "task${it}",
			description="",
			creationTime = System.currentTimeMillis(),
			textColor = Color.RED,
			status = Undefined
		)
	}
}