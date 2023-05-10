package com.example.demo.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Data
@Entity

public class School extends BaseEntity {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)

    Integer id;

    String name;

    String location;


}
