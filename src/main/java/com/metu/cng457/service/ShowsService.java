package com.metu.cng457.service;


import com.metu.cng457.entity.Show;
import com.metu.cng457.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ShowsService {
	@Autowired
    ShowRepository showsRepository;

    public Show saveShow(Show s){
        return showsRepository.save(s);
    }

    public Show getShow(int eventID){
        return showsRepository.findById(eventID).orElse(null);
	}

}