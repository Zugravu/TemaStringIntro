package com.couldschool.myfirstapi.controllers;

import com.couldschool.myfirstapi.model.Orders;
import com.couldschool.myfirstapi.model.Product;
import com.couldschool.myfirstapi.service.OrdersService;
import com.couldschool.myfirstapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("product")
public abstract class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("all")
    public List<Product> getAllOrders(){
        return productService.getAllProduct();
    }

    @GetMapping("{id}")
    public Product getById(@PathVariable Integer id){
        return productService.getById(id);
    }

    @PostMapping
    public Product saveCustomer(@RequestBody Product orders){
        return productService.saveProduct(orders);
    }

    @DeleteMapping("{id}")
    public void deleteOrders(@PathVariable Integer id){
        productService.deleteById(id);
    }
}
