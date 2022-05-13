package com.metu.cng457.service;


import com.metu.cng457.entity.Festival;
import com.metu.cng457.repository.FestivalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FestivalService {
	@Autowired
    FestivalRepository festivalRepository;

    public Festival saveFestival(Festival f){
        return festivalRepository.save(f);
    }

    public Festival getFestival(int festival_id){
        return festivalRepository.findById(festival_id).orElse(null);
	}

}
