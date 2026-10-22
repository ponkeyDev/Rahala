package com.rahala.demo.Inventory;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/shop")
public class InventoryController {
    


    @GetMapping("/products")
    public List<Inventory> getInventory(){

        return Arrays.asList(

       new Inventory(1,"laptop",2500.0,2),
        new Inventory(2,"Mouse",500.0,10),
        new Inventory(3, "Keyboard", 1000,5)

        );
    }
    @GetMapping("/products/{id}")
    public Inventory getProductById(@PathVariable Long id){
        if(id == 1 ){
            return new Inventory(1L,"laptop",2500.0,2);

        }
        else if(id == 2 ){
            return new Inventory(2L, "Mouse",500.0,10);

        }else if(id == 3 )
        {
            return new Inventory(3L, "Keyboard",1000.0,5);
        }
        else return new Inventory();
    }
} 
