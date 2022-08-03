package com.couldschool.myfirstapi.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue
    private Integer id;
    @NotNull
    private String username;
    @NotNull
    private String last_name;
    @NotNull
    private String first_name;
    @NotNull
    private String phone;
    @NotNull
    private String address;
    @NotNull
    private String city;
    private String postal_code;
    @NotNull
    private  String country;
}
