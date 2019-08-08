package com.BAE.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.BAE.service.PrizeGService;

@RestController
@RequestMapping("/PrizeG")
public class PrizeGController {

		@Autowired
		public PrizeGController( PrizeGService service) {
			this.service = service;
		}


		public PrizeGService service;


		@GetMapping(value = "/getPrize/{exchangeAccount}")
		public ResponseEntity<String>  createPrizeG(@PathVariable("exchangeAccount") String exchangeAccount) {
		
			return service.createPrizeG(exchangeAccount);
		}


		}

