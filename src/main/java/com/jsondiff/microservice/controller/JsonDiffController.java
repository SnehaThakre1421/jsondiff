package com.jsondiff.microservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsondiff.microservice.dto.LegacyResponse;
import com.jsondiff.microservice.dto.MicroserviceResponse;
import com.jsondiff.microservice.dto.RedisCacheResponse;

@RestController
public class JsonDiffController {
	
	@CrossOrigin(origins = "*")
	@GetMapping("/rediscacheDetails")
	 public RedisCacheResponse getRediscacheResponse() {
		
			/*
			 * int num = 1; if(num !=0 || num!=1 || num !=2) { System.out.println(num); }
			 */
		
		
		 RedisCacheResponse response = new RedisCacheResponse();
		 LegacyResponse legacyResponse =  new LegacyResponse();
		 MicroserviceResponse microRes =  new MicroserviceResponse();
		 legacyResponse.setCity("Hyd");
		 legacyResponse.setName("legacy");
		 legacyResponse.setPincode("500049");
		 legacyResponse.setCountry("India");
		 legacyResponse.setState("Telangana");
		 microRes.setCity("Hyderabad");
		 microRes.setPincode("500049");
//		 microRes.setName("micro");
		 microRes.setCountry("India");
		 response.setLegacyResponse(legacyResponse);
		 response.setMicroserviceResponse(microRes);
		 return response;
	 }

}
