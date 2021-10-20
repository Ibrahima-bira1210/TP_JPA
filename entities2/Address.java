package com.example.tp_jpa.entities2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@AllArgsConstructor @NoArgsConstructor @Getter @Setter
public class Address {
    @Column(name = "address", nullable = false)
    private String address;
}



