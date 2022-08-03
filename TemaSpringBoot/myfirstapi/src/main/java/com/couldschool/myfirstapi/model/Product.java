package com.couldschool.myfirstapi.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue
    private Integer code;
    @NotNull
    private String name;
    @NotNull
    private String description;
    @NotNull
    private int stock;
    @NotNull
    private Double price;
}
