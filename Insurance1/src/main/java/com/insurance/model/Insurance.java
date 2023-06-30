package com.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "insurance")

public class Insurance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

	private String insuranceholderName;
	private String insuranceType;
	private String insurancePeriod;
	private int amount;
	private String city;
	private String email;
	private String mobnumber;

}
