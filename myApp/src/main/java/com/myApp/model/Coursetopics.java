package com.myApp.model;

import java.io.Serializable;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="coursetopics")
public class Coursetopics implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int topicid;
private int courseid;
private String topicname;
private String description;
private LocalTime duration;
public Coursetopics(int topicid, int courseid, String topicname, String description, LocalTime duration) {
	super();
	this.topicid = topicid;
	this.courseid = courseid;
	this.topicname = topicname;
	this.description = description;
	this.duration = duration;
}
public int getTopicid() {
	return topicid;
}
public void setTopicid(int topicid) {
	this.topicid = topicid;
}
public int getCourseid() {
	return courseid;
}
public void setCourseid(int courseid) {
	this.courseid = courseid;
}
public String getTopicname() {
	return topicname;
}
public void setTopicname(String topicname) {
	this.topicname = topicname;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public LocalTime getDuration() {
	return duration;
}
public void setDuration(LocalTime duration) {
	this.duration = duration;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + topicid;
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
	Coursetopics other = (Coursetopics) obj;
	if (topicid != other.topicid)
		return false;
	return true;
}
@Override
public String toString() {
	return "Coursetopics [topicid=" + topicid + "]";
}


}
