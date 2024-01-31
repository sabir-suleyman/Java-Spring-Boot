/*
 * File: Price.java
 * Author: Sabir Süleymanlı  		(GitHub: @sabir-suleyman) (Mail: @suleymanlisabir3@gmail.com)
 * Date: January 31, 2024
 * Description: JPA entity for storing price information with fields for 'id', 'item', and 'price'. 
 * 				Utilizes Lombok annotations for concise code and integrates with Java Persistence API (JPA).
 * 
 */

package edu.uludag.sabir.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "price")

public class Price {

    @Id
    @GeneratedValue(strategy = GeneratedValue.IDENTITY)
    @Getter
    @Setter
    private long id;

    @Getter
    @Setter
    private String item;

    @Getter
    @Setter
    private Integer price;

}
