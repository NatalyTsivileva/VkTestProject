package com.tsivileva.database.entities

import androidx.room.TypeConverter
import com.tsivileva.core.data.*

class TaskStatusConverter {

	@TypeConverter
	fun toInt(status: TaskStatus) = when (status) {
		Undefined -> 0
		InProgress -> 1
		ToDo -> 2
		Done -> 3
	}


	@TypeConverter
	fun fromInt(number: Int): TaskStatus = when (number) {
		1 -> InProgress
		2 -> ToDo
		3 -> Done
		else -> Undefined
	}
}