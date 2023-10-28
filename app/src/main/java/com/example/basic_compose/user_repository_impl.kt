package com.example.basic_compose

package com.example.e_notes_app.feature_user.domain.repository

import com.example.e_notes_app.users.data.data_source.UserDao
import com.example.e_notes_app.users.domain.model.User
import kotlinx.coroutines.flow.Flow

class UserRepositoryImpl(
    private val dao: UserDao
) : UserRepository {
    override fun getUsers(): Flow<List<User>> {
        return dao.getUsers()
    }

    override suspend fun getUserById(id: Int): User? {
        return dao.getUserById(id)
    }

    override suspend fun insertUser(User: User) {
        dao.insertUser(User)
    }

    override suspend fun deleteUser(User: User) {
        dao.deleteUser(User)
    }
}
