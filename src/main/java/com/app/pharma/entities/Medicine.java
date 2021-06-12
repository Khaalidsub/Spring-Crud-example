package com.app.pharma.entities;

import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.Store;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "medicine")
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

    @Setter
    @Getter
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "store_owner_id", nullable = false)
    private StoreOwner storeOwner;
}
