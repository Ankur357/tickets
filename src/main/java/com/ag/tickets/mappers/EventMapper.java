package com.ag.tickets.mappers;

import com.ag.tickets.domain.CreateEventRequest;
import com.ag.tickets.domain.CreateTicketTypeRequest;
import com.ag.tickets.domain.dtos.*;
import com.ag.tickets.domain.entities.Event;
import com.ag.tickets.domain.entities.TicketType;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EventMapper {

    CreateTicketTypeRequest fromDto(CreateTicketTypeRequestDto dto);

    CreateEventRequest fromDto(CreateEventRequestDto dto);

    CreateEventResponseDto toDto(Event event);

    ListEventTicketTypeResponseDto toDto(TicketType ticketType);

    ListEventResponseDto toListEventResponseDto(Event event);

}
