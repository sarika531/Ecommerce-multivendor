package com.sasuha.modal;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private User user;
	/**
	 * Here one cart have multpile items all are related to one cart
	 * if add or remove any changes oocures it will relfect thats why we use 
	 * cascadeTye and orphonRemoval for cart item  removal purpose if 
	 * we remove it will remove
	 */
	
	@OneToMany(mappedBy = "cart",cascade = CascadeType.ALL ,orphanRemoval = true)
	private Set<CartItem> cartItem = new HashSet<>();
	
	private double totalSellingPrice;
	
	private int totalItem;
	
	private int discount;
	
	private String coupounCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<CartItem> getCartItem() {
		return cartItem;
	}

	public void setCartItem(Set<CartItem> cartItem) {
		this.cartItem = cartItem;
	}

	public double getTotalSellingPrice() {
		return totalSellingPrice;
	}

	public void setTotalSellingPrice(double totalSellingPrice) {
		this.totalSellingPrice = totalSellingPrice;
	}

	public int getTotalItem() {
		return totalItem;
	}

	public void setTotalItem(int totalItem) {
		this.totalItem = totalItem;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getCoupounCode() {
		return coupounCode;
	}

	public void setCoupounCode(String coupounCode) {
		this.coupounCode = coupounCode;
	}

	public Cart(Long id, User user, Set<CartItem> cartItem, double totalSellingPrice, int totalItem, int discount,
			String coupounCode) {
		super();
		this.id = id;
		this.user = user;
		this.cartItem = cartItem;
		this.totalSellingPrice = totalSellingPrice;
		this.totalItem = totalItem;
		this.discount = discount;
		this.coupounCode = coupounCode;
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(cartItem, coupounCode, discount, id, totalItem, totalSellingPrice, user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cart other = (Cart) obj;
		return Objects.equals(cartItem, other.cartItem) && Objects.equals(coupounCode, other.coupounCode)
				&& discount == other.discount && Objects.equals(id, other.id) && totalItem == other.totalItem
				&& Double.doubleToLongBits(totalSellingPrice) == Double.doubleToLongBits(other.totalSellingPrice)
				&& Objects.equals(user, other.user);
	}

}
