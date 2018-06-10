package com.bootapp.web.serviceImpl;

import com.bootapp.persistence.model.Ticket;
import com.bootapp.persistence.repo.TicketRepository;
import com.bootapp.web.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    TicketRepository ticketRepo;

    @Override
    public Ticket saveTicket(Ticket t) {
        return ticketRepo.save(t);
    }

    @Override
    public List<Ticket> getAllTickets() {
        return ticketRepo.findAll();
    }
}
