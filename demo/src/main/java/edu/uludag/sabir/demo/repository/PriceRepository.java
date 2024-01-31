/*
 * File: PriceRepository.java
 * Author: Sabir Süleymanlı  		(GitHub: @sabir-suleyman) (Mail: @suleymanlisabir3@gmail.com)
 * Date: January 31, 2024
 * Description: A Spring Data repository interface for the Price entity. 
 *              Extends CrudRepository for basic CRUD operations and defines 
 *              a custom query method, findAllByOrderByPrice(), 
 *              to retrieve all prices ordered by their 'price' attribute.
 * 
 */

package edu.uludag.sabir.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.uludag.sabir.model.Price;

@Repository
public interface PriceRepository extends CrudRepository<Price, Long> {
    public List<Price> findAllByOrderByPrice();
}
