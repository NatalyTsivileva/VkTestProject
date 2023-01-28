package com.tsivileva.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.tsivileva.database.entities.TaskEntity
import com.tsivileva.database.entities.TaskStatusConverter

@Database(entities = [TaskEntity::class], version = 1, exportSchema = false)
@TypeConverters(value = [TaskStatusConverter::class])
abstract class AppDatabase : RoomDatabase() {
	abstract fun taskDao(): TaskDAO
}