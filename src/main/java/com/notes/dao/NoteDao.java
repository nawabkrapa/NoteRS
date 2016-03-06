package com.notes.dao;

import java.util.List;

import com.notes.model.Note;

public interface NoteDao {
	void save(Note note);
	void update(Note note);
	void delete(Note note);
	Note findById(Long id);
	List<Note> findAllNotes(String emailId);
}
