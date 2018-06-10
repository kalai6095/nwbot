package com.bootapp.web.controller;

import com.bootapp.persistence.model.Ticket;
import com.bootapp.web.service.TicketService;
import com.bootapp.web.util.GenericSaveController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TicketController  extends GenericSaveController{

    @Autowired
    private TicketService ticketService;

    @GetMapping(value = "/getTickets")
    @ResponseBody
    public List<Ticket> getAllTickets() {
       return ticketService.getAllTickets();
    }
}
