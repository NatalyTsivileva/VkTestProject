package com.tsivileva.task.ui.fragment.list

import androidx.recyclerview.widget.DiffUtil
import com.tsivileva.core.data.Task

class TaskListDiffUtils: DiffUtil.ItemCallback<Task>() {

	override fun areItemsTheSame(oldItem: Task, newItem: Task): Boolean {
		return oldItem.id == newItem.id && oldItem.status == newItem.status
	}

	override fun areContentsTheSame(oldItem: Task, newItem: Task): Boolean {
		return oldItem == newItem
	}
}