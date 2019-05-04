package com.tms.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="")
public class TMSData {
	
	private String traineename;
	@Id
	private int traineeid;
	private String password;
	private String traineelocation;
	private String traineedomain;
	
	
	public TMSData() {
		
	}
	
	public TMSData(String traineename, int traineeid, String password, String traineelocation, String traineedomain) {
		super();
		this.traineename = traineename;
		this.traineeid = traineeid;
		this.password = password;
		this.traineelocation = traineelocation;
		this.traineedomain = traineedomain;
	}
	public String getTraineename() {
		return traineename;
	}
	public void setTraineename(String traineename) {
		this.traineename = traineename;
	}
	public int getTraineeid() {
		return traineeid;
	}
	public void setTraineeid(int traineeid) {
		this.traineeid = traineeid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTraineelocation() {
		return traineelocation;
	}
	public void setTraineelocation(String traineelocation) {
		this.traineelocation = traineelocation;
	}
	public String getTraineedomain() {
		return traineedomain;
	}
	public void setTraineedomain(String traineedomain) {
		this.traineedomain = traineedomain;
	}
	
	
	
	
	
	
}
