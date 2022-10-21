package com.example.e_notes_app.feature_note.data.data_source

import androidx.room.*
import com.example.e_notes_app.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface ToDoDao {

    @Query("SELECT * FROM todo")
    fun getToDos(): Flow<List<ToDo>>

    @Query("SELECT * FROM todo WHERE id = :id")
    suspend fun getToDoById(id: Int): ToDo?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertToDo(todo: ToDo)

    @Delete
    suspend fun deleteToDo(todo: ToDo)

}
