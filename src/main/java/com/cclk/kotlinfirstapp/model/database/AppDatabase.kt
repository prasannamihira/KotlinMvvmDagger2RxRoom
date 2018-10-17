package com.cclk.kotlinfirstapp.model.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.cclk.kotlinfirstapp.model.Post
import com.cclk.kotlinfirstapp.model.PostDao

@Database(entities = arrayOf(Post::class), version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun postDao():PostDao
}