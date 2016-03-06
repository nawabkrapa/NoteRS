package com.notes.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.notes.dao.NoteDao;
import com.notes.model.Note;
import com.notes.util.CustomHibernateDaoSupport;
@Repository("noteDao")
public class NoteDaoImpl extends CustomHibernateDaoSupport implements NoteDao {

	@Override
	public void save(Note note) {
		getHibernateTemplate().save(note);
		
	}

	@Override
	public void update(Note note) {
		getHibernateTemplate().saveOrUpdate(note);
		
	}

	@Override
	public void delete(Note note) {
		getHibernateTemplate().delete(note);
	}

	@Override
	public Note findById(Long id) {
		List list = getHibernateTemplate().find(
                "from Note where noteID=?",id
           );
		return (Note)list.get(0);
	}

	@Override
	public List<Note> findAllNotes(String emailId) {
		List list = getHibernateTemplate().find(
                "from Note note where user.emailId=?",emailId
           );
		return list;
	}

}
