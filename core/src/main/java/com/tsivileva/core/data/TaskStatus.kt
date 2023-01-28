package com.tsivileva.core.data

sealed class TaskStatus
object Undefined: TaskStatus()
object ToDo : TaskStatus()
object InProgress : TaskStatus()
object Done : TaskStatus()
