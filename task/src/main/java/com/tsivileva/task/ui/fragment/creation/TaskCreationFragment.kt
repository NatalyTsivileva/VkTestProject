package com.tsivileva.task.ui.fragment.creation

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.tsivileva.core.data.*
import com.tsivileva.task.R
import com.tsivileva.task.databinding.FrTaskCreationBinding
import com.tsivileva.task.ui.activity.TaskNavigation
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TaskCreationFragment() : Fragment(R.layout.fr_task_creation) {

	private var binding: FrTaskCreationBinding? = null

	private var taskCreationViewModel: TaskCreationViewModel? = null


	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)

		activity?.onBackPressedDispatcher?.addCallback(object : OnBackPressedCallback(true) {
			override fun handleOnBackPressed() {
				(activity as? TaskNavigation)?.navigateToTaskList()
			}
		})

		taskCreationViewModel = ViewModelProvider(this)[TaskCreationViewModel::class.java]
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		binding = FrTaskCreationBinding.bind(view)
		setupUi()
		bindData()
	}

	private fun setupUi() {
		binding?.apply {

			saveBtn.setOnClickListener {
				taskCreationViewModel?.addTask(
					name = this.taskNameLayout.editText?.text.toString(),
					description = this.descriptionLayout.editText?.text.toString(),
					status = getSelectedStatus()
				)
			}


		}
	}

	private fun getSelectedStatus():TaskStatus {
		val id = binding?.statusRadioGroup?.checkedRadioButtonId ?: Task.TASK_PLACEHOLDER_ID
		return when (id) {
			R.id.rbTodo -> ToDo
			R.id.rbInProgress -> InProgress
			R.id.rbDone -> Done
			else -> Undefined
		}
	}

	private fun bindData() {
		taskCreationViewModel?.isTaskAdded?.observe(viewLifecycleOwner) { isAdded ->
			if (isAdded) {
				showSuccessMs()
				activity?.onBackPressedDispatcher?.onBackPressed()
			} else {
				showErrorMsg()
			}
		}

	}

	private fun showSuccessMs() {
		val text = context?.getText(R.string.adding_task_successful) ?: ""
		Toast.makeText(requireContext(), text, Toast.LENGTH_SHORT).show()
	}

	private fun showErrorMsg() {
		val text = context?.getText(R.string.adding_task_failed) ?: ""
		Toast.makeText(requireContext(), text, Toast.LENGTH_LONG).show()
	}

	override fun onDestroy() {
		super.onDestroy()
		binding = null
	}
}