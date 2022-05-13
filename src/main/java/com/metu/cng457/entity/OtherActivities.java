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
@Table(name="otherActivities")
public class OtherActivities extends Event {
	@Id
	private int eventID;

}	