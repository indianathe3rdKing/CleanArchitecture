package com.example.cleanarchitecturetest.domain.usecase

import com.example.cleanarchitecturetest.domain.model.Note
import com.example.cleanarchitecturetest.domain.repository.NoteRepository

class AddNoteUseCase(private val repository: NoteRepository){
    operator fun invoke(note: Note)= repository.addNote(note)
}