package com.tsivileva.database.entities

import com.tsivileva.core.data.Task

object TaskModelConverter {

	fun toEntity(task: Task) = TaskEntity(
		id = task.id,
		creationTime = task.creationTime,
		text = task.text,
		textColor = task.textColor,
		status = task.status
	)

	fun fromEntity(entity: TaskEntity) = Task(
		id = entity.id,
		text = entity.text,
		creationTime = entity.creationTime,
		textColor = entity.textColor,
		status = entity.status
	)

}