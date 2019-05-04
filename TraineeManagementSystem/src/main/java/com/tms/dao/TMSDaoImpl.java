package com.tms.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.tms.model.TMSData;

@Component("Dao")
@Repository
public class TMSDaoImpl implements TMSDao{

	@Autowired
	EntityManager entityManager;


	public int addTrainee(TMSData data) {
		// TODO Auto-generated method stub
		entityManager.persist(data);
		return data.getTraineeid();
	}

	
	public int updateTrainee(TMSData data) {
		// TODO Auto-generated method stub
		entityManager.merge(data);
		return data.getTraineeid();
	}

	
	public int deleteTrainee(int traineeid) {
		// TODO Auto-generated method stub
		TMSData data = new TMSData();
		data.setTraineeid(traineeid);
		entityManager.remove(entityManager.contains(data) ? data : entityManager.merge(data));
		return data.getTraineeid();
	}

	
	public ArrayList<TMSData> getAll() {
		// TODO Auto-generated method stub
		Query query = (Query) entityManager.createQuery("from tms_data ");
		ArrayList<TMSData> list = (ArrayList<TMSData>) query.list();
		
		return list;
	}

	
	public TMSData getByTraineeid(int traineeid) {
		// TODO Auto-generated method stub
		TMSData data=entityManager.find(TMSData.class, traineeid);
		return data;
	
	}

	
	public int login(TMSData data) {
		// TODO Auto-generated method stub
		int id=0;
		TMSData data1 = entityManager.find(TMSData.class, data.getTraineeid());
		if(data.getPassword().equals(data1.getPassword())) {
			id = data1.getTraineeid();
		}
		return id;
	}
}

