package com.example.tuto_keycloack.customers;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Customer")
@Data
public class CustomersModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
}
