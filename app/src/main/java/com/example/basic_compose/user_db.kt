package com.example.e_notes_app.users.data.data_source
import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.e_notes_app.feature_note.data.data_source.UserDao
import com.example.e_notes_app.feature_note.domain.model.User
import com.google.firebase.firestore.auth.User

@Database(
    entities = [User::class],
    version = 1
)

abstract class UserDataBase : RoomDatabase() {
    abstract val userDao: UserDao
}
