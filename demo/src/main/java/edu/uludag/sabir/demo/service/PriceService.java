/*
 * File: PriceService.java
 * Author: Sabir Süleymanlı  		(GitHub: @sabir-suleyman) (Mail: @suleymanlisabir3@gmail.com)
 * Date: January 31, 2024
 * Description: A service class for handling business logic related to the Price entity. 
 *              Utilizes Spring's @Service annotation to indicate it as a service component. 
 *              Includes methods for finding a Price by ID, retrieving all Prices ordered by price, 
 *              and saving a new Price. Dependencies are injected using @Autowired.
 * 
 */

package edu.uludag.sabir.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uludag.demo.model.Price;
import edu.uludag.demo.repository.PriceRepository;

public class PriceService {
    
    @Autowired
    private PriceRepository priceRepository;

    public Price findById(Long id){
        if (id != null) {
            return priceRepository.findById(id).orElse(null);
        }
        return null;
    }

    public List<Price> findAll(){
        return (List<Price>) priceRepository.findAllByOrderByPrice();
    }

    public Price save(Price price){
        return priceRepository.save(price);
    }
