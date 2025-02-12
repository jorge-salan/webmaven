package com.arquitecturajava.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LeerJsonPersona {

	public Persona getPersona(String json) {
		ObjectMapper mapper = new ObjectMapper();
		JsonNode nodo = null;
		try {
			nodo = mapper.readTree(json);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Persona(nodo.get("nombre").asText());
		
	}
	
}
