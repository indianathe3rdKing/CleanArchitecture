package com.example.cleanarchitecturetest.domain.model

interface NoteRepository {
    fun addNote(note: Note )
    fun getNote(): List<Note>
    fun deleteNote(note:Note)
}