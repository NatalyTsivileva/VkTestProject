package com.tsivileva.database.di

import android.content.Context
import androidx.room.Room
import com.tsivileva.database.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

	@Provides
	@Singleton
	fun provideDatabase(@ApplicationContext context: Context): AppDatabase {
		return Room.databaseBuilder(
			context = context,
			klass = AppDatabase::class.java,
			name = "todo_database"
		).build()
	}
}