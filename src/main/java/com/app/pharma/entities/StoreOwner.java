package com.app.pharma.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
@Entity
@Table(name = "store_owners")
public class StoreOwner {
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
    @OneToMany( fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    private List<Medicine> medicines;
}
