package com.tsivileva.core.data

import android.graphics.Color
import java.text.SimpleDateFormat
import java.util.*

data class Task(
	val id: Long,
	val name: String,
	val description: String = "",
	val creationTime: Long,
	val textColor: Int = Color.BLACK,
	val status: TaskStatus = Undefined
) {

	fun creationTimeString(pattern: String = DATETIME_FULL_FORMAT): String {
		return SimpleDateFormat(pattern, Locale.getDefault()).format(creationTime)
	}

	companion object {
		const val DATETIME_FULL_FORMAT = "dd.MM.yy HH:mm:ss"
		const val TASK_PLACEHOLDER_ID = -1L

		fun taskListPlaceholder() =
			listOf(Task(id = TASK_PLACEHOLDER_ID, name = "", description = "", creationTime = 0))


	}
}
