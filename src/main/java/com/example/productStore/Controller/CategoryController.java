package com.example.productStore.Controller;

import com.example.productStore.dtos.ProductListRequestDto;
import com.example.productStore.services.CategoryService;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/category")
public class CategoryController {
    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @GetMapping("/{uuid}")
    public void getCategory(@PathVariable("uuid") String uuid){
        categoryService.getCategory(uuid);
    }

    @PostMapping("")
    public void getProductList(@RequestBody ProductListRequestDto request){
        categoryService.getProductList(request.getUuids());

    }

}
