package com.example.cleanarchitecturetest.domain.usecase

import com.example.cleanarchitecturetest.domain.model.Note
import com.example.cleanarchitecturetest.domain.repository.NoteRepository

class DeleteNoteUseCase(private val repository: NoteRepository) {
    operator fun invoke(note:Note): List<Note> = repository.deleteNote(note)
}