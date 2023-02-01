
package com.tsivileva.task.di

import com.tsivileva.database.AppDatabase
import com.tsivileva.task.repository.TaskRepository
import com.tsivileva.task.repository.TaskRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TaskModule {

	@Provides
	@Singleton
	fun provideTaskRepo(database: AppDatabase): TaskRepository {
		return TaskRepositoryImpl(database)
	}
}
