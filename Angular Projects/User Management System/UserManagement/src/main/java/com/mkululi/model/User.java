package com.mkululi.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "UserData")
@Setter
@Getter
public class User {
    public User(String name, String username, String phoneNo, String email, String password) {
        this.name = name;
        this.username = username;
        this.phoneNo = phoneNo;
        this.email = email;
        this.password = password;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String username;

    private String phoneNo;

    private String email;

    private String password;
}
