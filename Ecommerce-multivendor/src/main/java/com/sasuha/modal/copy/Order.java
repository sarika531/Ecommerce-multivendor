package com.sasuha.modal.copy;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.sasuha.domain.PaymentStatus;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Order {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private Long id;
	 
	 private String orderId;
	 
	 private User user;
	 
	 private Long sellerId;
	 
	 @OneToMany(mappedBy ="order" , cascade=CascadeType.ALL,orphanRemoval = true)
	 private List<OrderItem> orderItem = new ArrayList<>();
	 
	 @ManyToMany
	 private Address shippingAddress;
	 
	 @Embedded
	 private PaymentDetails paymentDetails = new PaymentDetails();
	 
	 private double totalMrpPrice;
	 
	 private Integer totalSellingPrice;
	 
	 private Integer discount;
	 
	 private OrderStatus orderStatus;
	 
	 private int totalItem;
	 
	 private PaymentStatus paymentstatus = PaymentStatus.PENDING;
	 
	 private LocalDateTime orderDate =LocalDateTime.now();
	 
	 private LocalDateTime deliverDate = orderDate.plusDays(7);

	 
	 
	 

}
