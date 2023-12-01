package com.example.insurance.model;

import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="users", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "passport")
    private String passport;

    private String email;
    private String number;
    private String password;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user", fetch=FetchType.LAZY)
    private List<Record> insurance;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))
    private Collection<Role> roles;



    public User(String firstName, String lastName,String passport, String email, String number, String password, Collection<Role> roles) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passport = passport;
        this.email = email;
        this.number = number;
        this.password = password;
        this.roles = roles;
    }

    public User() {

    }
}
