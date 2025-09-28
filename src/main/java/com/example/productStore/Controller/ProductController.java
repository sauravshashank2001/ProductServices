package com.example.productStore.Controller;


import com.example.productStore.dtos.ExceptionDTO;
import com.example.productStore.dtos.GenericProductDto;
import com.example.productStore.exceptions.NotFoundException;
import com.example.productStore.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    public ProductService productService;

    @Autowired
    public ProductController(@Qualifier("fakeStoreProductService") ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/")
    public List<GenericProductDto> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public GenericProductDto getProductById(@PathVariable("id") Long id){
        return productService.getProductById(id);
    }



    public void updateProductById(){

    }

    @PostMapping("/")
    public GenericProductDto createProduct(@RequestBody GenericProductDto genericProductDto){
        return productService.createProduct(genericProductDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<GenericProductDto> deleteProduct(@PathVariable("id") Long id){
//        return productService.deleteProduct(id);
        return new ResponseEntity<>(productService.deleteProduct(id),HttpStatus.OK);


    }

    @PutMapping("/{id}")
    public ResponseEntity<GenericProductDto> updateProduct(@PathVariable("id") Long id,@RequestBody GenericProductDto genericProductDto){
        return new ResponseEntity<>(productService.updateProduct(id,genericProductDto),HttpStatus.OK);
    }

//    @ExceptionHandler(NotFoundException.class)
//    public ResponseEntity<ExceptionDTO> handleNotFoundException(NotFoundException notFoundException){
//        ExceptionDTO dto = new ExceptionDTO(HttpStatus.NOT_FOUND, notFoundException.getMessage());
//        return new ResponseEntity<>(dto, HttpStatus.NOT_FOUND);
//    }
}
