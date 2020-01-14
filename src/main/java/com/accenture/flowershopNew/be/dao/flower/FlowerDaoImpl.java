package com.accenture.flowershopNew.be.dao.flower;

import org.springframework.stereotype.Repository;

@Repository
public class FlowerDaoImpl implements FlowerDao {
    public FlowerDaoImpl() {
        System.out.println("Бин " + FlowerDaoImpl.class);
    }
}
