package com.tsivileva.task.ui.fragment.creation

import androidx.lifecycle.*
import com.tsivileva.core.data.Task
import com.tsivileva.core.data.TaskStatus
import com.tsivileva.task.repository.TaskRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TaskCreationViewModel @Inject constructor(
	private val repository: TaskRepository
) : ViewModel() {

	private var _addedTaskId = MutableLiveData<Long>()

	val isTaskAdded: LiveData<Boolean>
		get() = Transformations.switchMap(_addedTaskId) { MutableLiveData(it > Task.TASK_PLACEHOLDER_ID) }

	fun addTask(name: String, description: String, status: TaskStatus) {
		try {
			viewModelScope.launch {
				val task = Task(
					id = 0L,
					name = name,
					description = description,
					creationTime = System.currentTimeMillis(),
					status = status
				)
				_addedTaskId.value = repository.addTask(task)
			}
		} catch (e: Exception) {
			_addedTaskId.value = Task.TASK_PLACEHOLDER_ID
		}
	}

}