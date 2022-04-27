package com.springboot.carefirst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

class Validate {

	@Test
	void test() throws URISyntaxException {

		RestTemplate restTemplate = new RestTemplate();
		final String baseURL = "http://localhost:8080/allClient";
		URI uri = new URI(baseURL);
		ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);

		assertEquals(200, result.getStatusCodeValue());

	}

}
