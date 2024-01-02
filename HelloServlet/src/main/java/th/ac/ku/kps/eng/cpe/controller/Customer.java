package th.ac.ku.kps.eng.cpe.controller;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
	@JsonProperty("AAA")
	private String name;
	
	public Customer(String name) {
		this.name = name;
	}
	
	public Customer() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
