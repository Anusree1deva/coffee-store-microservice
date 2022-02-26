package com.menu.microservice.menu_microservice.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "items")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    @Id
    private Integer id;
    @Column(nullable = false, name = "item_name")
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "menu_id")
    private Menu menu;
    @Column(nullable = false, name = "item_price")
    private Double price;

    @Column(nullable = false, name = "item_description")
    private String description;
    @Column(nullable = false, name = "item_image")
    @Lob
    private String image;
    @JsonProperty("updated_on")
    @Column(nullable = false, name = "updated_on")
    private LocalDate updateOn;

    @Override
    public String toString() {
        return "Item [description=" + description + ", id=" + id + ", image=" + image + ", name=" + name + ", price="
                + price + ", updateOn=" + updateOn + "]";
    }

}
