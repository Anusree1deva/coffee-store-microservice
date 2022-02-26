package com.menu.microservice.menu_microservice.controller;
import java.util.List;
import com.menu.microservice.menu_microservice.model.Item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemDTO {

    
    private List<Item> items;

   
    
}
