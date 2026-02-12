package com.example.cleanarchitecturetest.presentation

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.cleanarchitecturetest.data.NoteRepositoryImpl
import com.example.cleanarchitecturetest.domain.model.Note
import com.example.cleanarchitecturetest.domain.usecase.AddNoteUseCase
import com.example.cleanarchitecturetest.domain.usecase.DeleteNoteUseCase
import com.example.cleanarchitecturetest.domain.usecase.GetNotesUseCase

class NoteViewModel: ViewModel() {
    private val repository = NoteRepositoryImpl()
    private val addNotesUseCase = AddNoteUseCase(repository)
    private val getNotesUseCase = GetNotesUseCase(repository)
    private val deleteNoteUseCase = DeleteNoteUseCase(repository)

    var notes = mutableStateListOf<Note>()
    private set

//    Loads all notes when the view model is created
fun loadNotes(){
    notes.clear()
    notes.addAll(getNotesUseCase())
}
//    Adds a new note and refreshes the list
fun addNote(text: String){
    if (text.isNotBlank()){
        addNotesUseCase(Note(0,text))
        loadNotes()
    }
}

//    Deletes a note and refreshes list
fun deleteNote(note: Note){
    deleteNoteUseCase(note)
    loadNotes()
}

}