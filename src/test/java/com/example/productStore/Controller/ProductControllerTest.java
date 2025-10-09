package com.example.productStore.Controller;

import com.example.productStore.dtos.GenericProductDto;
import com.example.productStore.exceptions.NotFoundException;
import com.example.productStore.services.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.when;

@SpringBootTest
public class ProductControllerTest {

    @Autowired
    private ProductController productController;

    @Mock
    private ProductService productServiceMock;

//    private ProductControllerTest(){
//        productServiceMock = Mockito.mock(ProductService.class);
//        productController = new ProductController(productServiceMock);
//    }

    @Test
    public void testGetProductByIdReturnsEmptyObjectWhenNoProductIsFound(){
        when(productServiceMock.getProductById(1L))
                .thenReturn(null);

        GenericProductDto response = productController.getProductById(1L);
        Assertions.assertNotNull(response);

    }


}
