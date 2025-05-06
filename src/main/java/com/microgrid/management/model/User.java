package com.microgrid.management.model;

import jakarta.persistence.ManyToOne;

public class User {
    private Long id;

    private String name;
    private String email;
    private String password;
    private Role role;

    @ManyToOne
    private Microgrid microgrid;
}
