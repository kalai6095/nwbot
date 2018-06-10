package com.bootapp.web.init;

import com.bootapp.persistence.model.Ticket;
import com.bootapp.web.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Date;

@Component
public class Init {
    @Autowired
    private TicketService ticketService;

    @PostConstruct
    public void init(){
        System.out.println("hai this is spring application post construct");
        Ticket t=new Ticket();
        t.setBookingDate(new Date());
        t.setDestinationStation("BLR");
        t.setEmail("6095@gmail.com");
        t.setPassengerName("Kalai");
        t.setSourceStation("SLM");
        t.setTicketId(1l);
        ticketService.saveTicket(t);
    }
}
