package com.metu.cng457.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="organizers")
public class Organizers{
	@Id
	private String email;
	private int phoneNo;
	private String name;
	private String surname;
}

