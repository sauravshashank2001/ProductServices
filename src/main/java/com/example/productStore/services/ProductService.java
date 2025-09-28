package com.example.productStore.services;

import com.example.productStore.dtos.GenericProductDto;

import java.util.List;

public interface ProductService {

    public GenericProductDto getProductById(Long id);
    public GenericProductDto deleteProduct(Long id);
    public GenericProductDto createProduct(GenericProductDto genericProductDto );
    public GenericProductDto updateProduct(Long id,GenericProductDto genericProductDto );
    public List<GenericProductDto> getAllProducts();
}
