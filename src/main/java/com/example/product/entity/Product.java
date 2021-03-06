package com.example.product.entity;

import com.example.product.entity.enums.GenderStatus;
import com.example.product.entity.enums.ProductStatus;
import lombok.*;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table (name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    private String gender;
    private String color;
    private String size;
    private double price;
    private LocalDateTime createdAt;
    private int status;
}
