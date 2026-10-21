package com.rahala.demo.Inventory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/shop")
public class InventoryController {
    


    @GetMapping("/products")
    public Inventory getInventory(){

        return new Inventory(1,"laptop",2500.0,2);
    }
} 
