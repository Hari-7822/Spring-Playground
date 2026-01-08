package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "model")
@Data
public class model {
    @id
    @GenerativeValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private boolean completed = false;
    private String name;

}
