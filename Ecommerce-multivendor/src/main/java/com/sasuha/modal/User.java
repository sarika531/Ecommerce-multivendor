package com.sasuha.modal;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sasuha.domain.USER_ROLE;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY )
	private String password;
	
	private String email;
	
	private String fullname;
	
	private String mobile;
	
	private USER_ROLE role = USER_ROLE.ROLE_CUSTOMER;
	/**
	 * if the address is saved we can used it it doenot allows any address which rleted the same address
	 * one user have multiple address but addrss have only one user
	 */
	@OneToMany
	private Set<Address> addresses = new HashSet<>();
	/**
	 * once they use the coupons they cannot use again the same coupns
	 * many user can have same coupn and one user have same coupm
	 */
	@ManyToMany
	@JsonIgnore
	private Set<Coupons> coupons = new HashSet<>();
	
	

}



