package com.example.productStore.repository;

import com.example.productStore.models.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price, String> {


}
