package com.metu.cng457.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@DiscriminatorValue("1")
@Table(name="concert")
public class Concert extends Event {
	@Id
	private int eventID;
	private String performer;

}	