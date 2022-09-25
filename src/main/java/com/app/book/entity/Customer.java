package com.app.book.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "My_Customer")
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

}
