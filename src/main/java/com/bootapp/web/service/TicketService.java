package com.bootapp.web.service;

import com.bootapp.persistence.model.Ticket;

import java.util.List;

public interface TicketService {
    Ticket saveTicket(Ticket t);

    List<Ticket> getAllTickets();
}
