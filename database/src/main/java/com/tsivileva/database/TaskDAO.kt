package com.tsivileva.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.tsivileva.database.entities.TaskEntity

@Dao
interface TaskDAO {
	@Query("SELECT * FROM task")
	suspend fun getTaskList(): List<TaskEntity>

	@Insert
	suspend fun addTask(task: TaskEntity): Long

	@Delete
	suspend fun deleteTask(task: TaskEntity): Int
}