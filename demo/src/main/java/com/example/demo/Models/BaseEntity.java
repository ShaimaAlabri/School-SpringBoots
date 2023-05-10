package com.example.demo.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import javax.persistence.MappedSuperclass;
import java.util.Date;

import javax.persistence.Entity;

@Getter
@Setter
@MappedSuperclass


public class BaseEntity {

    @CreatedDate
    Date createdDate;

    @UpdateTimestamp
    Date updatedDate;

    Boolean isActive;
}
