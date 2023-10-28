package com.example.e_notes_app.feature_note.data.data_source

import androidx.annotation.StringDef
import androidx.room.*
import com.example.e_notes_app.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {

    @Query("SELECT * FROM users")
    fun getNotes(): Flow<List<User>>

    @Query("SELECT * FROM note WHERE id = :id")
    suspend fun getUserById(id: Int): User?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUser(note: User)

    @Delete
    suspend fun deleteUser(note: User)

}


data class User(val name: String, val age: Int)