package com.metu.cng457.service;


import com.metu.cng457.entity.OtherActivities;
import com.metu.cng457.repository.OtherActivitiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class OtherAvtivitiesService {
	@Autowired
    OtherActivitiesRepository otherAvtivitiesRepository;

    public OtherActivities getOtherAvtivities(int eventID){
        return otherAvtivitiesRepository.findById(eventID).orElse(null);
	}

    public OtherActivities saveOtherAvtivities(OtherActivities Oa){
        return otherAvtivitiesRepository.save(Oa);
    }

}