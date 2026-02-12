package com.example.cleanarchitecturetest.domain.usecase

import com.example.cleanarchitecturetest.domain.model.Note
import com.example.cleanarchitecturetest.domain.repository.NoteRepository

class GetNotesUseCase (private val repository: NoteRepository){
    operator fun invoke(): List<Note> = repository.getNotes()
}