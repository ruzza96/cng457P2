package com.metu.cng457.repository;

import com.metu.cng457.entity.Concert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConcertRepository extends JpaRepository<Concert, Integer> {
}