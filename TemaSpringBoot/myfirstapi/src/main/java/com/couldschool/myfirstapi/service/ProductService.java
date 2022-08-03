package com.couldschool.myfirstapi.service;

import com.couldschool.myfirstapi.model.Orders;
import com.couldschool.myfirstapi.model.Product;
import com.couldschool.myfirstapi.repository.OrdersRepository;
import com.couldschool.myfirstapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProduct(){
        List<Product> aux = new ArrayList<>();
        productRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    }

    public Product getById(Integer id){
        return productRepository.findById(id).get();
    }

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public void deleteById(Integer id){
        productRepository.deleteById(id);
    }
}
