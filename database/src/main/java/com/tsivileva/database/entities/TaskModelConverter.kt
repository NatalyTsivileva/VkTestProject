package com.tsivileva.database.entities

import com.tsivileva.core.data.Task

object TaskModelConverter {

	fun toEntity(task: Task) = TaskEntity(
		name = task.name,
		description = task.description,
		creationTime = task.creationTime,
		textColor = task.textColor,
		status = task.status
	)

	fun fromEntity(entity: TaskEntity) = Task(
		id = entity.id,
		name = entity.name,
		description = entity.description,
		creationTime = entity.creationTime,
		textColor = entity.textColor,
		status = entity.status
	)

}