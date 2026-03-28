package com.hibernate.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import com.hibernate.enums.Gender;
import com.hibernate.enums.PetType;


@Entity
@Table(name="Owner table")

public class Owner {
    @Id
    private int id;

    @Column(name="firstName",nullable = false)
    private String firstName;

    private String lastName;

    @Enumerated(value=EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;
    private String city;
    private String state;
        private String mobileNumber;
        private String emailid;
        private int petid;
        private String petName;

        private LocalDate petBirthDate;

    @Enumerated(value=EnumType.STRING)
    @Column(nullable = false)
        private Gender petGender;

    @Enumerated(value=EnumType.STRING)
    @Column(nullable = false)
        private PetType petType;


}
