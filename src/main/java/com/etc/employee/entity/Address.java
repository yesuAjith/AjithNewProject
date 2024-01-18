package com.etc.employee.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="emp_add")
@Entity
public class Address {
 
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="add_id")
	private Integer id;
	@Column(name="emp_city")
	private String City;
	@Column(name="emp_state")
	private String State;
}
