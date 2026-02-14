package com.ag.tickets.repository;

import java.util.UUID;

import com.ag.tickets.domain.entities.TicketValidation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketValidationRepository extends JpaRepository<TicketValidation, UUID> {
}
