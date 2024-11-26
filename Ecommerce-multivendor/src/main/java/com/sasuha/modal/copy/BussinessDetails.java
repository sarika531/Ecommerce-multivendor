package com.sasuha.modal.copy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class BussinessDetails {
	
	 private String bussinessName;
	 
	 private String businessEmail;
	 
	 private String businessMobile;
	 
	 private String businessAdress;
	 
	 private String logo;
	 
	 private String banner;
}
