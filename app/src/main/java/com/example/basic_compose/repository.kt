package com.example.e_notes_app.feature_note.domain.repository

import com.example.e_notes_app.feature_note.data.data_source.NoteDao
import com.example.e_notes_app.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    private val dao: NoteDao
) : NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        dao.deleteNote(note)
    }
}



class ToDoRepositoryImpl(
    private val dao: ToDoDao
) : ToDoRepository {
    override fun getToDos(): Flow<List<ToDo>> {
        return dao.getToDos()
    }

    override suspend fun getToDoById(id: Int): ToDo? {
        return dao.getToDoById(id)
    }

    override suspend fun insertToDo(todo: ToDo) {
        dao.insertToDo(todo)
    }

    override suspend fun deleteToDo(todo: ToDo) {
        dao.deleteToDo(todo)
    }
}
