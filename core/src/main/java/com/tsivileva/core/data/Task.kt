package com.tsivileva.core.data

import android.graphics.Color

data class Task(
	val id: Int,
	val text: String,
	val creationTime: Long,
	val textColor: Int = Color.BLACK,
	val status: TaskStatus = Undefined
)
