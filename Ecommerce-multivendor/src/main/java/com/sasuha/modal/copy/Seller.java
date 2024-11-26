package com.sasuha.modal.copy;

import java.util.Objects;

import org.springframework.security.authentication.AccountStatusException;

import com.sasuha.domain.AccountStatus;
import com.sasuha.domain.USER_ROLE;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Seller {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String sellerName;
	
	private String mobile;
	@Column(unique = true, nullable =false)
	private String email;
	
	
	private String password;
	
	@Embedded
	private BussinessDetails bussinessdetailss = new BussinessDetails();
	
	@Embedded
	private BankDetails bankDetails = new BankDetails();
	
	private Address pickupAddress = new Address();
	
	private String GSTIN;
	
	private USER_ROLE role=USER_ROLE.ROLE_SELLER;
	
	private boolean isEmailVerified=false;
	
	private AccountStatus accountStatus = AccountStatus.PENDING_VERFICATION;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public BussinessDetails getBussinessdetailss() {
		return bussinessdetailss;
	}

	public void setBussinessdetailss(BussinessDetails bussinessdetailss) {
		this.bussinessdetailss = bussinessdetailss;
	}

	public BankDetails getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}

	public Address getPickupAddress() {
		return pickupAddress;
	}

	public void setPickupAddress(Address pickupAddress) {
		this.pickupAddress = pickupAddress;
	}

	public String getGSTIN() {
		return GSTIN;
	}

	public void setGSTIN(String gSTIN) {
		GSTIN = gSTIN;
	}

	public USER_ROLE getRole() {
		return role;
	}

	public void setRole(USER_ROLE role) {
		this.role = role;
	}

	public boolean isEmailVerified() {
		return isEmailVerified;
	}

	public void setEmailVerified(boolean isEmailVerified) {
		this.isEmailVerified = isEmailVerified;
	}

	public AccountStatus getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(AccountStatus accountStatus) {
		this.accountStatus = accountStatus;
	}

	public Seller(Long id, String sellerName, String mobile, String email, String password,
			BussinessDetails bussinessdetailss, BankDetails bankDetails, Address pickupAddress, String gSTIN,
			USER_ROLE role, boolean isEmailVerified, AccountStatus accountStatus) {
		super();
		this.id = id;
		this.sellerName = sellerName;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
		this.bussinessdetailss = bussinessdetailss;
		this.bankDetails = bankDetails;
		this.pickupAddress = pickupAddress;
		GSTIN = gSTIN;
		this.role = role;
		this.isEmailVerified = isEmailVerified;
		this.accountStatus = accountStatus;
	}

	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(GSTIN, accountStatus, bankDetails, bussinessdetailss, email, id, isEmailVerified, mobile,
				password, pickupAddress, role, sellerName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		return Objects.equals(GSTIN, other.GSTIN) && Objects.equals(accountStatus, other.accountStatus)
				&& Objects.equals(bankDetails, other.bankDetails)
				&& Objects.equals(bussinessdetailss, other.bussinessdetailss) && Objects.equals(email, other.email)
				&& Objects.equals(id, other.id) && isEmailVerified == other.isEmailVerified
				&& Objects.equals(mobile, other.mobile) && Objects.equals(password, other.password)
				&& Objects.equals(pickupAddress, other.pickupAddress) && role == other.role
				&& Objects.equals(sellerName, other.sellerName);
	}
	
	

	
	
	
	

}
