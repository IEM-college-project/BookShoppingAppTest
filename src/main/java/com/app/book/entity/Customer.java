package com.app.book.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "my_customer")
@Builder
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cust_id", length = 20)
	private Long cust_Id;

	@Column(name = "cust_name", length = 30)
	private String cust_Name;

	@Column(name = "cust_address", length = 50)
	private String cust_Address;

	@Column(name = "cust_phno", length = 10)
	private String cust_Phno;

	@Column(name = "cust_email", length = 50)
	private String cust_Email;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_id", referencedColumnName = "order_id")
	private Order order_Id;

}
