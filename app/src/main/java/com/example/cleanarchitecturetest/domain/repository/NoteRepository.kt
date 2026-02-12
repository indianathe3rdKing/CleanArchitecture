package com.example.cleanarchitecturetest.domain.repository

import com.example.cleanarchitecturetest.domain.model.Note

interface NoteRepository {
    fun addNote(note: Note)
    fun getNote(): List<Note>
    fun deleteNote(note: Note)
}