package com.tsivileva.task.repository

import com.tsivileva.core.data.Task

interface TaskRepository {
	suspend fun getTaskList(): List<Task>

	suspend fun addTask(task: Task): Long

	suspend fun removeTask(task: Task): Int
}