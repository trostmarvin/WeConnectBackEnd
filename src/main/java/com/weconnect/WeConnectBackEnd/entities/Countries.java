package com.weconnect.WeConnectBackEnd.entities;

import javax.persistence.*;

@Entity
public class Countries {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int phone;

    @Column(length=2, nullable=false, unique=true)
    private String code;

    @Column(length=80, nullable = false, unique=true)
    private String name;
}
