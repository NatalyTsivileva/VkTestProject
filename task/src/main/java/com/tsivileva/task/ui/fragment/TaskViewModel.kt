package com.tsivileva.task.ui.fragment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tsivileva.core.data.Task
import com.tsivileva.task.repository.TaskRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TaskViewModel @Inject constructor(
	private val repository: TaskRepository
) : ViewModel() {

	private val _taskListStateFlow = MutableSharedFlow<List<Task>>()

	val taskListStateFlow: StateFlow<List<Task>> = _taskListStateFlow.stateIn(
		viewModelScope,
		SharingStarted.Lazily,
		emptyList()
	)

	suspend fun getTaskList() =
			_taskListStateFlow.emit(repository.getTaskList())


	fun addTask(task: Task) {
		viewModelScope.launch {
			repository.addTask(task)
		}
	}



}