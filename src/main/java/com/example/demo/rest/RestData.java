package com.example.demo.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ModelData;

@RestController
@RequestMapping(path = "/rest/dataJD")
public class RestData {
	
	@GetMapping(path = "/obtendatos", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ModelData getData(@RequestParam(name = "msg") String message){ 
		ModelData response = new ModelData();
		if(message.equals("JD")) {
			response.setCode(200);
			response.setStatus(true);
			response.setMensaje("Mensaje Success... " + message);
			
		}else {
			response.setCode(402);
			response.setStatus(false);
			response.setMensaje("Mensaje fallido... " + message);
		}
		return response;
		
	}
}
