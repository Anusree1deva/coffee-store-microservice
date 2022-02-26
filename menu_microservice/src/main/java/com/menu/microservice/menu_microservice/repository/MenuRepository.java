package com.menu.microservice.menu_microservice.repository;

import java.time.LocalDate;
import java.util.List;

import com.menu.microservice.menu_microservice.model.Menu;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu,Integer>{

    Menu findByMenuDate(LocalDate date);

    void deleteByMenuDate(LocalDate date);


    List<Menu> findByMenuDateBetween(LocalDate startDate, LocalDate endDate);
    

}
