package com.example.demo031624.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="demo_table1")
// import lombok to use it's annotations
public @Data class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="age")
	private int age;
	
}