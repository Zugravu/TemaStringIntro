package com.couldschool.myfirstapi.controllers;

import com.couldschool.myfirstapi.model.Customer;
import com.couldschool.myfirstapi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("customer")
public abstract class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("all")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomer();
    }

    @GetMapping("{id}")
    public Customer getById(@PathVariable Integer id){
        return customerService.getById(id);
    }

    @PostMapping("add")
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }

    @DeleteMapping("{id}")
    public void deleteCustomer(@PathVariable Integer id){
        customerService.deleteById(id);
    }

}
