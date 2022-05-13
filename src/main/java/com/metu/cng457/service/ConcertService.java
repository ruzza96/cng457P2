package com.metu.cng457.service;



import com.metu.cng457.entity.Concert;
import com.metu.cng457.repository.ConcertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ConcertService {
	@Autowired
    ConcertRepository concertRepository;

    public Concert saveConcert(Concert c){
        return concertRepository.save(c);
    }

    public Concert getConcert(int eventID){
        return concertRepository.findById(eventID).orElse(null);
	}

}