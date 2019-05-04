package com.tms.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tms.dao.TMSDao;
import com.tms.model.TMSData;

@Component("service")
@Service
@Transactional
public class TMSServiceImpl implements TMSService{

	@Autowired
	TMSDao Dao;

	@Override
	public int addTrainee(TMSData data) {
		// TODO Auto-generated method stub
		return Dao.addTrainee(data);
	}

	@Override
	public int updateTrainee(TMSData data) {
		// TODO Auto-generated method stub
		return Dao.updateTrainee(data);
	}

	@Override
	public int deleteTrainee(int traineeid) {
		// TODO Auto-generated method stub
		return Dao.deleteTrainee(traineeid);
	}

	@Override
	public ArrayList<TMSData> getAll() {
		// TODO Auto-generated method stub
		return Dao.getAll();
	}

	@Override
	public TMSData getByTraineeid(int traineeid) {
		// TODO Auto-generated method stub
		return Dao.getByTraineeid(traineeid);
	}

	@Override
	public int login(TMSData data) {
		// TODO Auto-generated method stub
		return Dao.login(data);
	}
}
