package com.metu.cng457.service;


import com.metu.cng457.entity.Event;
import com.metu.cng457.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EventsService {
	@Autowired
    EventRepository eventsRepository;

    public Event saveEvents(Event e){
        return eventsRepository.save(e);
    }

    public Event getEvents(int eventID){
        return eventsRepository.findById(eventID).orElse(null);
	}

}