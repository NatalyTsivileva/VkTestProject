package com.tsivileva.task.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tsivileva.task.R
import com.tsivileva.task.ui.fragment.creation.TaskCreationFragment
import com.tsivileva.task.ui.fragment.list.TaskListFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TaskActivity : AppCompatActivity(), TaskNavigation {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_task)

		navigateToTaskList()
	}


	// TODO: заменить на Android Jetpack's Navigation
	override fun navigateToTaskList() {
		replaceFragmentInUi(R.id.fragmentContainer, TASK_LIST_FRAGMENT_TAG, TaskListFragment(),true)
	}

	override fun navigateToTaskCreation() {
		replaceFragmentInUi(R.id.fragmentContainer, TASK_CREATION_FRAGMENT_TAG, TaskCreationFragment(),true)
	}

	companion object {
		const val TASK_LIST_FRAGMENT_TAG = "TaskListFragment"
		const val TASK_CREATION_FRAGMENT_TAG = "TaskCreationFragment"
	}
}