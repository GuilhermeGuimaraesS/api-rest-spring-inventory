package com.guimaraes.inventory.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "product_id")
        Long productId;

        @Column(name = "product_name")
        String productName;
        Double price;

        @ManyToOne
        @JoinColumn(name = "category_product_id")
        Category productCategory;

}
