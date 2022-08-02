package com.app.book.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

//@AllArgsConstructor
//@NoArgsConstructor
//@Data

@Entity
@Table(name = "myorder")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_id", length = 20)
	private Long order_Id;

	@Column(name = "price", length = 6)
	private Double price;

	@Column(name = "last_update", nullable = false)
	@UpdateTimestamp
	private Date last_Update;

	@Column(name = "quantity", length = 6)
	private Long quantity;

	@Column(name = "order_date", length = 8)
	@CreationTimestamp
	private Date order_Date;

	@Column(name = "order_tracking", length = 10)
	private String order_Tracking;

}