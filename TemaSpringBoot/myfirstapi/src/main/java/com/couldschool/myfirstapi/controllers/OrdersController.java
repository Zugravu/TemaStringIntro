package com.couldschool.myfirstapi.controllers;

import com.couldschool.myfirstapi.model.Customer;
import com.couldschool.myfirstapi.model.Orders;
import com.couldschool.myfirstapi.service.CustomerService;
import com.couldschool.myfirstapi.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("orders")
public abstract class OrdersController {
    @Autowired
    OrdersService ordersService;

    @GetMapping("all")
    public List<Orders> getAllOrders(){
        return ordersService.getAllOrders();
    }

    @GetMapping("{id}")
    public Orders getById(@PathVariable Integer id){
        return ordersService.getById(id);
    }

    @PostMapping
    public Orders saveCustomer(@RequestBody Orders orders){
        return ordersService.saveOrders(orders);
    }

    @DeleteMapping("{id}")
    public void deleteOrders(@PathVariable Integer id){
        ordersService.deleteById(id);
    }
}
