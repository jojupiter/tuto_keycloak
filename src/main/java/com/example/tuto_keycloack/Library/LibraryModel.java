package com.example.tuto_keycloack.Library;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Library")
@Data
public class LibraryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

}
