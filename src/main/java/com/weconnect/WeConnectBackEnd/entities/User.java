package com.weconnect.WeConnectBackEnd.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;


import javax.persistence.*;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false, unique = true)
    private String email;

    @Column(length=32, nullable=false, unique = true)
    private String username;

    @JsonIgnore
    @Column(nullable=false)
    private String password;

    @Column(length=1)
    private String gender;

    @Column(length=2)
    private String countrycode;

    @Column(length=5)
    private String zipcode;
}
