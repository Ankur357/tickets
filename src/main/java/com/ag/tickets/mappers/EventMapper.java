package com.ag.tickets.mappers;

import com.ag.tickets.domain.CreateEventRequest;
import com.ag.tickets.domain.CreateTicketTypeRequest;
import com.ag.tickets.domain.dtos.CreateEventRequestDto;
import com.ag.tickets.domain.dtos.CreateEventResponseDto;
import com.ag.tickets.domain.dtos.CreateTicketTypeRequestDto;
import com.ag.tickets.domain.entities.Event;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EventMapper {

    CreateTicketTypeRequest fromDto(CreateTicketTypeRequestDto dto);

    CreateEventRequest fromDto(CreateEventRequestDto dto);

    CreateEventResponseDto toDto(Event event);

}
