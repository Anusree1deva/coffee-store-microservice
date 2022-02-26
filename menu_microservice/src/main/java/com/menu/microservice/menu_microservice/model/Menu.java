package com.menu.microservice.menu_microservice.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="menus")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "menu_date",nullable = false)
    private LocalDate menuDate;

    @OneToMany(mappedBy = "menu",cascade =CascadeType.MERGE, fetch = FetchType.EAGER)
    private List<Item> items;

    @Column(name = "upadated_on",nullable = false)
    private LocalDate updatedDate;
    
}


