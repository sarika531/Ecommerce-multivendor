package com.sasuha.modal.copy;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Coupons {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String code;
	
	private  double discountPercantage;
	
	private LocalDate validityStartDate;
	
	private LocalDate validityEndDate;
	
	private double minimumOrdervalue;
	
	private boolean isActive=true;
	
	@ManyToMany(mappedBy = "usedCoupons")
	private Set<User> userByusers = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getDiscountPercantage() {
		return discountPercantage;
	}

	public void setDiscountPercantage(double discountPercantage) {
		this.discountPercantage = discountPercantage;
	}

	public LocalDate getValidityStartDate() {
		return validityStartDate;
	}

	public void setValidityStartDate(LocalDate validityStartDate) {
		this.validityStartDate = validityStartDate;
	}

	public LocalDate getValidityEndDate() {
		return validityEndDate;
	}

	public void setValidityEndDate(LocalDate validityEndDate) {
		this.validityEndDate = validityEndDate;
	}

	public double getMinimumOrdervalue() {
		return minimumOrdervalue;
	}

	public void setMinimumOrdervalue(double minimumOrdervalue) {
		this.minimumOrdervalue = minimumOrdervalue;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Set<User> getUserByusers() {
		return userByusers;
	}

	public void setUserByusers(Set<User> userByusers) {
		this.userByusers = userByusers;
	}

	public Coupons(Long id, String code, double discountPercantage, LocalDate validityStartDate,
			LocalDate validityEndDate, double minimumOrdervalue, boolean isActive, Set<User> userByusers) {
		super();
		this.id = id;
		this.code = code;
		this.discountPercantage = discountPercantage;
		this.validityStartDate = validityStartDate;
		this.validityEndDate = validityEndDate;
		this.minimumOrdervalue = minimumOrdervalue;
		this.isActive = isActive;
		this.userByusers = userByusers;
	}

	public Coupons() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, discountPercantage, id, isActive, minimumOrdervalue, userByusers, validityEndDate,
				validityStartDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coupons other = (Coupons) obj;
		return Objects.equals(code, other.code)
				&& Double.doubleToLongBits(discountPercantage) == Double.doubleToLongBits(other.discountPercantage)
				&& Objects.equals(id, other.id) && isActive == other.isActive
				&& Double.doubleToLongBits(minimumOrdervalue) == Double.doubleToLongBits(other.minimumOrdervalue)
				&& Objects.equals(userByusers, other.userByusers)
				&& Objects.equals(validityEndDate, other.validityEndDate)
				&& Objects.equals(validityStartDate, other.validityStartDate);
	}
	
	
	

}
