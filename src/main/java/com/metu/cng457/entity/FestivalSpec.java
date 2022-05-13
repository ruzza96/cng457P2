package com.metu.cng457.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="festivalSpec")
public class FestivalSpec {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int festivalSpecID;
    private String dates;
	private String duration;
}