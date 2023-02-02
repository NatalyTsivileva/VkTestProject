package com.tsivileva.task.ui.fragment.list

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.tsivileva.task.R
import com.tsivileva.task.databinding.FtTaskListBinding
import com.tsivileva.task.ui.activity.TaskNavigation
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class TaskListFragment : Fragment(R.layout.ft_task_list) {

	private var binding: FtTaskListBinding? = null

	private var viewModel: TaskListViewModel? = null

	private val listAdapter = TaskListAdapter()


	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		viewModel = ViewModelProvider(this)[TaskListViewModel::class.java]
	}


	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		binding = FtTaskListBinding.bind(view)
		setupUi()
		bindData()
	}

	private fun setupUi() {
		binding?.taskListRecyclerView?.adapter = listAdapter
		binding?.addTaskBtn?.setOnClickListener {
			(activity as? TaskNavigation)?.navigateToTaskCreation()
		}
	}


	private fun bindData() {
		viewLifecycleOwner.lifecycleScope.launch {
			viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
				viewModel?.taskListStateFlow?.collect { data ->
					listAdapter.submitList(data)
				}
			}
		}

		viewModel?.getTaskList()
	}

	override fun onDestroy() {
		super.onDestroy()
		binding = null
	}


}