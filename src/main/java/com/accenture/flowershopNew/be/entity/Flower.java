package com.accenture.flowershopNew.be.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "FLOWERS")
public class Flower {
    Long id;
    String flowerName;
    Float price;
    Integer coast;

    public Flower(Long id, String flowerName, Float price, Integer coast) {
        this.id = id;
        this.flowerName = flowerName;
        this.price = price;
        this.coast = coast;
    }


}
