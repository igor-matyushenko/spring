package com.accenture.flowershopNew.be.business.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;



@Service
public class OrderBusinessServiceImpl implements OrderBusinessService {
    private static final Logger LOG = LoggerFactory.getLogger(OrderBusinessServiceImpl.class);
    public OrderBusinessServiceImpl() {
        System.out.println("Бин " + OrderBusinessServiceImpl.class);
    }
}
