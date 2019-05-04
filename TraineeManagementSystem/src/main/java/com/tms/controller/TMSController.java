package com.tms.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tms.model.TMSData;
import com.tms.service.TMSService;
import com.tms.userException.NoUserFoundException;

@RestController
public class TMSController {
	
	int id;
	
	@Autowired
	TMSService service;
		
	@GetMapping("/")
	public String Hello() {
		return "Hello";
	}
	
	
	@GetMapping("/login")
	public void login(@RequestBody TMSData data) {
		id = service.login(data);
		
	}
	
	@PutMapping("/addTrainee")
	public int add(@RequestBody TMSData data) {
		int amount=0;
		if(id != 0) {
		 amount=service.addTrainee(data);
		}
		return amount;
	}
		
	@PutMapping("/updateTrainee")
	public ResponseEntity updateProduct(@RequestBody TMSData data) {
		if(id!=0) {
		service.updateTrainee(data);
		}
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteTrainee")
	public ResponseEntity deleteProduct(@RequestBody int traineeid) {
		if(id!=0) {
		service.deleteTrainee(traineeid);
		}
		return new ResponseEntity(HttpStatus.OK);
		
	}
	
	@GetMapping("/getById")
	public ResponseEntity getById(@RequestBody int traineeid) {
		TMSData data = null;
		if(id!=0) {
		data = service.getByTraineeid(traineeid);
		}
		if(data==null) {
			throw new NoUserFoundException("user not found "+ traineeid);
		}
		else
			return new ResponseEntity("success",HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
			public ArrayList<TMSData> getAllData(){
			ArrayList<TMSData> data = null;
			if(id!=0) {
					data = service.getAll();
			}
				return data;
		}
	
}
