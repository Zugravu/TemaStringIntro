package com.couldschool.myfirstapi.service;

import com.couldschool.myfirstapi.model.Customer;
import com.couldschool.myfirstapi.model.Orders;
import com.couldschool.myfirstapi.repository.CustomerRepository;
import com.couldschool.myfirstapi.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrdersService {
    @Autowired
    OrdersRepository ordersRepository;

    public List<Orders> getAllOrders(){
        List<Orders> aux = new ArrayList<>();
        ordersRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    }

    public Orders getById(Integer id){
        return ordersRepository.findById(id).get();
    }

    public Orders saveOrders(Orders orders){
        return ordersRepository.save(orders);
    }

    public void deleteById(Integer id){
        ordersRepository.deleteById(id);
    }

}
