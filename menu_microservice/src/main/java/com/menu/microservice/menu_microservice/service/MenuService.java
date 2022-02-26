package com.menu.microservice.menu_microservice.service;

import java.time.LocalDate;
import java.util.List;

import com.menu.microservice.menu_microservice.model.Menu;

public interface MenuService {
    Menu findByMenuDate(LocalDate date);

    Menu save(Menu entity);
    
    void deleteByMenuDate(LocalDate date);

    List<Menu> findByMenuDateBetween(LocalDate startDate, LocalDate endDate);

    
    
} 
