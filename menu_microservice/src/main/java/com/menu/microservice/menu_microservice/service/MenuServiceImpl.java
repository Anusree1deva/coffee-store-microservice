package com.menu.microservice.menu_microservice.service;

import java.time.LocalDate;
import java.util.List;

import com.menu.microservice.menu_microservice.model.Menu;
import com.menu.microservice.menu_microservice.repository.MenuRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    MenuRepository menuRepository;

    @Override
    public Menu findByMenuDate(LocalDate date) {
        
        return menuRepository.findByMenuDate(date);
    }
    
    @Override
    public Menu save(Menu entity) {
        
        return menuRepository.save(entity);
    }

    @Override
    public void deleteByMenuDate(LocalDate date) {
        menuRepository.deleteByMenuDate(date);
        
    }

    @Override
    public List<Menu> findByMenuDateBetween(LocalDate startDate, LocalDate endDate) {
        
        return menuRepository.findByMenuDateBetween(startDate,endDate);
    }

    
}
