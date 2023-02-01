package com.tsivileva.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.tsivileva.core.data.TaskStatus

@Entity(tableName = "task")
data class TaskEntity(

	@PrimaryKey(autoGenerate = true)
	val id: Long = 0L,

	val text: String,

	val creationTime: Long,

	val textColor: Int,

	@TypeConverters(TaskStatusConverter::class)
	val status: TaskStatus
)