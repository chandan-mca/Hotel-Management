package com.mca.user.service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="micro_users")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private String userId;

    @Column(name="NAME", length = 20)
    private String name;

    @Column(name="EMAIL")
    private String email;

    @Column(name="ABOUT")
    private  String about;

}
