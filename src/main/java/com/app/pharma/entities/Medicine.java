package com.app.pharma.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter
    @Getter
    private Integer id;
    @Setter
    @Getter
    private String name;
    @Setter
    @Getter
    private BigDecimal price;
    @Setter
    @Getter
    private Integer quantity;
    @Setter
    @Getter
    private String manufacturerName;

}
