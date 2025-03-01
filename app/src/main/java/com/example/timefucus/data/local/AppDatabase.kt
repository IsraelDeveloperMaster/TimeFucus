package com.example.timefucus.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.timefucus.data.local.dao.TimerSessionDao
import com.example.timefucus.data.local.entity.TimerSessionEntity

@Database(entities = [TimerSessionEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun timerSessionDao(): TimerSessionDao
}