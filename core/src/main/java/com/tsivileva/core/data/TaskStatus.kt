package com.tsivileva.core.data

sealed class TaskStatus{
	abstract fun getName():String
}

object Undefined: TaskStatus() {
	override fun getName(): String = "Undefined"
}

object ToDo : TaskStatus(){
	override fun getName(): String = "ToDo"
}
object InProgress : TaskStatus() {
	override fun getName(): String = "InProgress"
}

object Done : TaskStatus(){
	override fun getName(): String = "Done"
}
