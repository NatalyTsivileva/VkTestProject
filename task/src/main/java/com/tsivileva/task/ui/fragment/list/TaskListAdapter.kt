package com.tsivileva.task.ui.fragment.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.tsivileva.core.data.Task
import com.tsivileva.task.databinding.ItemTaskListBinding
import com.tsivileva.task.databinding.ItemTaskListPlaceholderBinding

class TaskListAdapter : ListAdapter<Task, RecyclerView.ViewHolder>(TaskListDiffUtils()) {

	override fun submitList(list: List<Task>?) {
		if (!list.isNullOrEmpty())
			super.submitList(list)
		else
			super.submitList(Task.taskListPlaceholder())
	}


	override fun getItemViewType(position: Int): Int =
		if (currentList[position].id == Task.TASK_PLACEHOLDER_ID)
			TaskItemTypes.EMPTY_PLACEHOLDER.ordinal
		else
			TaskItemTypes.ITEM.ordinal


	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
		val inflater = LayoutInflater.from(parent.context)

		return when (viewType) {
			TaskItemTypes.ITEM.ordinal -> {
				val binding = ItemTaskListBinding.inflate(inflater, parent, false)
				ViewHolder(binding)
			}

			else -> {
				val binding = ItemTaskListPlaceholderBinding.inflate(inflater, parent, false)
				EmptyViewHolder(binding)
			}
		}
	}


	override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
		val item = getItem(position)

		when (getItemViewType(position)) {
			TaskItemTypes.ITEM.ordinal -> (holder as? ViewHolder)?.apply { bind(item) }
			TaskItemTypes.EMPTY_PLACEHOLDER.ordinal -> (holder as? EmptyViewHolder)
		}
	}


	inner class ViewHolder(private val binding: ItemTaskListBinding) :
		RecyclerView.ViewHolder(binding.root) {

		fun bind(item: Task) {
			binding.name.text = item.name
			binding.name.setTextColor(item.textColor)
			binding.description.text = item.description
			binding.time.text = item.creationTimeString()
			binding.statusText.text = item.status.getName()
		}

	}

	inner class EmptyViewHolder(binding: ItemTaskListPlaceholderBinding):RecyclerView.ViewHolder(binding.root)

	enum class TaskItemTypes { ITEM, EMPTY_PLACEHOLDER }
}