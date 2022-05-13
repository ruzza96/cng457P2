package com.metu.cng457.repository;

import com.metu.cng457.entity.Festival;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FestivalRepository extends JpaRepository<Festival, Integer> {
    List<Festival> findAllByCity(String city);
}