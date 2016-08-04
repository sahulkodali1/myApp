package com.myApp.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cous=rsedetails")
public class Coursedetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int courseid;
	private String coursename;
	private String prerequisites;
	private String author;
	private String description;
	private Skilllevel level;
	public Coursedetails(int courseid, String coursename, String prerequisites, String author, String description,
			Skilllevel level) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.prerequisites = prerequisites;
		this.author = author;
		this.description = description;
		this.level = level;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getPrerequisites() {
		return prerequisites;
	}
	public void setPrerequisites(String prerequisites) {
		this.prerequisites = prerequisites;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Skilllevel getLevel() {
		return level;
	}
	public void setLevel(Skilllevel level) {
		this.level = level;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + courseid;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coursedetails other = (Coursedetails) obj;
		if (courseid != other.courseid)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Coursedetails [courseid=" + courseid + "]";
	}
}
