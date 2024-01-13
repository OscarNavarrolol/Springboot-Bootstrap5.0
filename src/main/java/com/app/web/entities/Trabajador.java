package com.app.web.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "trabajador")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trabajador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "nombre",nullable = false)
    String name;
    @Column(name = "apellido" ,nullable = false)
    String apellido;
    @Column(name = "email",nullable = false,unique = true)
    String email;


}


