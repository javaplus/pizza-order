package com.barry.order.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.barry.order.entities.Order;
import com.barry.order.services.OrderCreationEventService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class OrderController {
    @Autowired
    private OrderCreationEventService orderCreationService;
    
    @RequestMapping(value="/orders", method=RequestMethod.GET)
    public String getOrders() {
        return "Orders";
    }

    @RequestMapping(value="/orders", method=RequestMethod.POST)
    public String createOrder(@RequestBody Order order) {

        System.out.println("Order name " + order.getName());
        orderCreationService.createOrderEvent(order);
        return "Order Created";
    }
    
    
    

}