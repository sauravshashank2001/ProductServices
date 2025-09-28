package com.example.productStore.inheritanceexample.tableperclass;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="tpc_mentor")
public class Mentor extends User {
    private double avgRating;
}
