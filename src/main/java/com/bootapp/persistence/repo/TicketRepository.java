package com.bootapp.persistence.repo;

import com.bootapp.persistence.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Long> {
}
