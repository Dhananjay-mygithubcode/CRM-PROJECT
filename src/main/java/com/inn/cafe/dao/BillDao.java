package com.inn.cafe.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import com.inn.cafe.POJO.Bill;

public interface BillDao extends MongoRepository<Bill, String> {
    List<Bill> findAll(); // Equivalent to getAllBills()

    List<Bill> findByUserName(@Param("username") String username);
}
