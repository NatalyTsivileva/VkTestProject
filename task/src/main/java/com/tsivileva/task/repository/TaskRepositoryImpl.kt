package com.tsivileva.task.repository

import com.tsivileva.core.data.Task
import com.tsivileva.database.AppDatabase
import com.tsivileva.database.entities.TaskModelConverter

class TaskRepositoryImpl(
	database: AppDatabase
) : TaskRepository {

	private val taskDao = database.taskDao()

	override suspend fun getTaskList(): List<Task> {
		return taskDao
			.getTaskList()
			.map { TaskModelConverter.fromEntity(it) }
	}

	override suspend fun addTask(task: Task): Long {
		return taskDao.addTask(
			TaskModelConverter.toEntity(task)
		)
	}

	override suspend fun removeTask(task: Task): Int {
		return taskDao.deleteTask(
			TaskModelConverter.toEntity(task)
		)
	}
}