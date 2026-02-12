package com.example.cleanarchitecturetest.data

import com.example.cleanarchitecturetest.domain.model.Note
import com.example.cleanarchitecturetest.domain.repository.NoteRepository

class NoteRepositoryImpl : NoteRepository {
    private val notes = mutableListOf<Note>()
    private var nextId = 1

    override fun addNote(note: Note) {
        notes.add(note.copy(id = nextId++))
    }

    override fun getNotes(): List<Note> = notes.toList()


    override fun deleteNote(note: Note) {
        notes.removeIf { it.id == note.id }
    }
}