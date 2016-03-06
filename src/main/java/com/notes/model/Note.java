package com.notes.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "NOTE")
@XmlRootElement(name="note")
public class Note implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8045300249016017896L;
	@Id
	@GeneratedValue
	@Column(name = "NOTE_ID", unique = true, nullable = false)
	private long noteID;
	@Column(name = "NOTE_TITLE", unique = true, nullable = false, length = 50)
	private String noteTitle;
	@Column(name = "NOTE_TITLE", length = 1000)
	private String noteBody;
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	private User user;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_DATE")
	private Date createDate;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATE_DATE")
	private Date updateDate;
	public String getNoteTitle() {
		return noteTitle;
	}
	public void setNoteTitle(String noteTitle) {
		this.noteTitle = noteTitle;
	}
	public String getNoteBody() {
		return noteBody;
	}
	public void setNoteBody(String noteBody) {
		this.noteBody = noteBody;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public long getNoteID() {
		return noteID;
	}
	public void setNoteID(long noteID) {
		this.noteID = noteID;
	}
}
