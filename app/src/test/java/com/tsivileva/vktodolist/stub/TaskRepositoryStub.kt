package com.tsivileva.vktodolist.stub

import com.tsivileva.core.data.Task
import com.tsivileva.task.repository.TaskRepository

class TaskRepositoryStub : TaskRepository {

	override suspend fun getTaskList(): List<Task> {
		return createTaskList()
	}

	override suspend fun addTask(task: Task): Long {
		return 0L
	}

	override suspend fun removeTask(task: Task): Int {
		return 0
	}


	companion object {
		const val TASK_COUNT = 10

		fun createTaskList(count: Int = TASK_COUNT) = (0 until count).map {
			Task(
				id = it.toLong(),
				name = "task${it}",
				creationTime = it.toLong()
			)
		}
	}
}