package com.example.e_notes_app.feature_note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.e_notes_app.feature_note.domain.model.ToDo

@Database(
    entities = [ToDo::class],
    version = 1
)
abstract class ToDoDataBase : RoomDatabase() {

    abstract val todoDao: ToDoDao

}
