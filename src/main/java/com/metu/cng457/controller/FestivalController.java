package com.metu.cng457.controller;

import com.metu.cng457.entity.*;
import com.metu.cng457.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class FestivalController {
    @Autowired
    FestivalRepository festivalRepository;

    @Autowired
    ConcertRepository concertRepository;

    @Autowired
    ShowRepository showRepository;

    @Autowired
    OtherActivitiesRepository otherActivitiesRepository;

    @Autowired
    OrganizersRepository organizersRepository;



    @GetMapping("/getallfestivals")
    public List<Festival> getFestivals() {
        return festivalRepository.findAll();
    }

    @GetMapping("/getfestivalsforacity/{city}")
    public List<Festival> getFestivalsById(@PathVariable String city){
        return festivalRepository.findAllByCity(city);
    }

    @GetMapping("/getfestival/{festivalid}")
    public List<Festival> getFestivalsById(@PathVariable Integer festivalid){
        return festivalRepository.findAllById(Collections.singleton(festivalid));
    }

    @PostMapping("/addfestival")
    public Festival addFestival(@RequestBody Festival p){
        return festivalRepository.save(p);
    }

    @PostMapping("/addconcert")
    public Concert addConcert(@RequestBody Concert p){
        return concertRepository.save(p);
    }
    @PostMapping("/addshow")
    public Show addShow(@RequestBody Show p){
        return showRepository.save(p);
    }
    @PostMapping("/addotheractivity")
    public OtherActivities addOtheractivity(@RequestBody OtherActivities p){
        return otherActivitiesRepository.save(p);
    }
    @PostMapping("/addorganiser")
    public Organizers addOrganizer(@RequestBody Organizers p){
        return organizersRepository.save(p);
    }

}
