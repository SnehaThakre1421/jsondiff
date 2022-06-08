package com.jsondiff.microservice.dto;


public class RedisCacheResponse {

	private LegacyResponse legacyResponse;
	private MicroserviceResponse microserviceResponse;
	
	public RedisCacheResponse() {
		
	}

	public MicroserviceResponse getMicroserviceResponse() {
		return microserviceResponse;
	}

	public void setMicroserviceResponse(MicroserviceResponse microserviceResponse) {
		this.microserviceResponse = microserviceResponse;
	}

	public LegacyResponse getLegacyResponse() {
		return legacyResponse;
	}

	public void setLegacyResponse(LegacyResponse legacyResponse) {
		this.legacyResponse = legacyResponse;
	}
}
