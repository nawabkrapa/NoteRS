package com.notes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notes.dao.NoteDao;
import com.notes.model.Note;
import com.notes.service.NoteService;
@Service("noteService")
public class NoteServiceImpl implements NoteService {
	@Autowired
	NoteDao noteDao ;
	@Override
	public void save(Note note) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Note note) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Note note) {
		// TODO Auto-generated method stub

	}

	@Override
	public Note findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	 public List<Note> findAllNotes(String emailId) {
	        return noteDao.findAllNotes(emailId);
	    }

}
