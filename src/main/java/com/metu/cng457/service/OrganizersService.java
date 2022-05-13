package com.metu.cng457.service;


import com.metu.cng457.entity.Organizers;
import com.metu.cng457.repository.OrganizersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class OrganizersService {
	@Autowired
    OrganizersRepository organizersRepository;

    public Organizers saveOrganizer(Organizers o){
        return organizersRepository.save(o);
    }

    public Organizers getOrganizer(String email){
        return organizersRepository.findById(email).orElse(null);
	}

}