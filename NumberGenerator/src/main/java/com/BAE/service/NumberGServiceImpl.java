package com.BAE.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;



@Service
public class NumberGServiceImpl implements NumberGService {



	@Override
	public ResponseEntity<String> createNumberG() {
		Random rand = new Random(); 
		Integer numgen = rand.nextInt(999999);
		String numString = numgen.toString();
		ResponseEntity<String> retVal = new ResponseEntity<String>(numString, HttpStatus.OK);
				
		return retVal;

	}



}
