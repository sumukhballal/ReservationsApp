package com.devops.reservations.data.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/reservations")
public class ReservationController {

    @RequestMapping(method = RequestMethod.GET)
    public String getReservations(@RequestParam(value = "date",required=false)String dateString, Model model)
    {

        return "reservations";
    }
}
