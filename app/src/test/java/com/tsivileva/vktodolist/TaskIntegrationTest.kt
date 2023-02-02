package com.tsivileva.vktodolist

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.tsivileva.task.repository.TaskRepository
import com.tsivileva.task.ui.fragment.list.TaskListViewModel
import com.tsivileva.vktodolist.stub.TaskRepositoryStub
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.test.*
import org.junit.*
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


@OptIn(ExperimentalCoroutinesApi::class)
@RunWith(JUnit4::class)
class TaskIntegrationTest {


	@get:Rule
	val rule = InstantTaskExecutorRule()

	private lateinit var viewModel: TaskListViewModel
	private val repository: TaskRepository = TaskRepositoryStub()


	@Before
	fun setUpViewModel() {
		Dispatchers.setMain(UnconfinedTestDispatcher())
		viewModel = TaskListViewModel(repository)
	}

	@After
	fun clean() {
		Dispatchers.resetMain()
	}

	@Test
	fun `when request task list - should return task list from repository`(): Unit = runTest {
		// Create an empty collector for the StateFlow
		val collectJob = launch(UnconfinedTestDispatcher(testScheduler)) {
			viewModel.taskListStateFlow.collect()
		}

		viewModel.getTaskList()

		val actualTaskList = viewModel.taskListStateFlow.value
		val expectedTaskList = TaskRepositoryStub.createTaskList()

		Assert.assertEquals(expectedTaskList, actualTaskList)

		// Cancel the collecting job at the end of the test
		collectJob.cancel()
	}
}