package com.couldschool.myfirstapi.repository;

import com.couldschool.myfirstapi.model.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository extends CrudRepository<Orders, Integer> {
    List<Orders> findAll();
}
