package com.metu.cng457.service;


import com.metu.cng457.entity.FestivalSpec;
import com.metu.cng457.repository.FestivalSpecRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FestivalSpecService {
	@Autowired
    FestivalSpecRepository festivalSpecRepository;

    public FestivalSpec saveFestivalSpec(FestivalSpec fs){
        return festivalSpecRepository.save(fs);
    }

    public FestivalSpec getFestivalSpec(int festivalSpecID){
        return festivalSpecRepository.findById(festivalSpecID).orElse(null);
	}

}