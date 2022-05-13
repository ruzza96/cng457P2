package com.metu.cng457.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name="festivals")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Festival {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int festival_ID;
	@OneToMany(targetEntity = FestivalSpec.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "FestivalSpecID",referencedColumnName = "festival_ID")
	private List<FestivalSpec> festivalSpec;
	@OneToMany(targetEntity = Event.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "eventID")
	private List<Event> event;
	private String nameFestival;
	private String placeFestival;

	private String city;
	
}
