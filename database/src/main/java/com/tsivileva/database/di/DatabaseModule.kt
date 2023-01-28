package com.tsivileva.database.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.tsivileva.database.AppDatabase

object DatabaseModule {

	fun provideDatabase(context: Context): RoomDatabase {
		return Room.databaseBuilder(
			context = context.applicationContext,
			klass = AppDatabase::class.java,
			name = "todo_database"
		).build()
	}
}