package com.tms.dao;

import java.util.ArrayList;

import com.tms.model.TMSData;

public interface TMSDao {
	int addTrainee(TMSData data);
    int updateTrainee(TMSData data);
	int deleteTrainee(int traineeid);
	ArrayList<TMSData> getAll();
	TMSData getByTraineeid(int traineeid);
	int login(TMSData data);

}
