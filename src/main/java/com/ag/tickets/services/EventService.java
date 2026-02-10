package com.ag.tickets.services;

import com.ag.tickets.domain.CreateEventRequest;
import com.ag.tickets.domain.entities.Event;

import java.util.UUID;

public interface EventService {

    Event createEvent(UUID organizerId, CreateEventRequest event);

}
