package com.tsivileva.task.ui.fragment.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tsivileva.core.data.Task
import com.tsivileva.task.repository.TaskRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TaskListViewModel @Inject constructor(
	private val repository: TaskRepository
) : ViewModel() {

	private val _taskListStateFlow = MutableSharedFlow<List<Task>>()

	val taskListStateFlow: StateFlow<List<Task>> = _taskListStateFlow.stateIn(
		viewModelScope,
		SharingStarted.Lazily,
		emptyList()
	)

	fun getTaskList() {
		viewModelScope.launch {
			_taskListStateFlow.emit(repository.getTaskList())
		}
	}



}