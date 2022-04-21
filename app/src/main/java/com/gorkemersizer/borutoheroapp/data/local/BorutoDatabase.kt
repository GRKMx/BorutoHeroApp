package com.gorkemersizer.borutoheroapp.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.gorkemersizer.borutoheroapp.data.local.dao.HeroDao
import com.gorkemersizer.borutoheroapp.data.local.dao.HeroRemoteKeysDao
import com.gorkemersizer.borutoheroapp.domain.model.Hero
import com.gorkemersizer.borutoheroapp.domain.model.HeroRemoteKeys

@Database(entities = [Hero::class, HeroRemoteKeys::class], version = 1)
@TypeConverters(DatabaseConverter::class)
abstract class BorutoDatabase: RoomDatabase() {

    companion object {
        fun create (context: Context, useInMemory: Boolean): BorutoDatabase {
            val databaseBuilder = if (useInMemory) {
                Room.databaseBuilder(context, BorutoDatabase::class.java, "test_database2.db")
            } else {
                Room.databaseBuilder(context, BorutoDatabase::class.java, "test_database.db")
            }
            return databaseBuilder
                .fallbackToDestructiveMigration()
                .build()
        }
    }

    abstract fun heroDao(): HeroDao
    abstract fun heroRemoteKeysDao(): HeroRemoteKeysDao

}