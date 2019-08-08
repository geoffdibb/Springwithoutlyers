package com.BAE.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;




@Service
public class PrizeGServiceImpl implements PrizeGService {



	@Override
	public ResponseEntity<String> createPrizeG( String exchangeAccount) {
		
		int result = Integer.parseInt(exchangeAccount);		
		if (result > 500000) {
		String prizeString = "Winner!";
		
		ResponseEntity<String> retValPrize = new ResponseEntity<String>(prizeString, HttpStatus.OK);
		return retValPrize;

				}
		else{
			String prizeString = "not Winner";
			
			ResponseEntity<String> retValPrize = new ResponseEntity<String>(prizeString, HttpStatus.OK);
		return retValPrize;

		}		

	}

}
