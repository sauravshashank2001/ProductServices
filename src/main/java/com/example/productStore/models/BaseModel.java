package com.example.productStore.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Getter
@Setter
@MappedSuperclass
public class BaseModel {
    @Id
    @GeneratedValue(generator = "uuidgenerator")
    @GenericGenerator(name="uuidgenerator", strategy = "uuid2")
    @Column(name = "id", columnDefinition = "char(36)", nullable = false, updatable = false)
    private String uuid;
}
