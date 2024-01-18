package com.etc.employee.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="etc_employee")
public class Employee {
    
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="emp_id")
	private Integer id;
	@Column(name="emp_name")
	private String name;
	@Column(name="emp_location")
	private String location;
	
	@OneToMany(targetEntity = Address.class, cascade=CascadeType.ALL)
	@JoinColumn(name="fk_etc_emp_id",referencedColumnName = "emp_id")
	private List <Address> address = new ArrayList<>();
}
