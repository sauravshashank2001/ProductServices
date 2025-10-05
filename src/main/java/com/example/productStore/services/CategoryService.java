package com.example.productStore.services;

import com.example.productStore.models.Category;
import com.example.productStore.models.Product;
import com.example.productStore.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

        private CategoryRepository categoryRepository;

        @Autowired
        public CategoryService(CategoryRepository categoryRepository){
            this.categoryRepository = categoryRepository;
        }

        @Transactional
        public void getCategory(String uuid){
            Optional<Category> categoryOptional = categoryRepository.findById(uuid);
            Category category = categoryOptional.get();
            System.out.println(category);

            List<Product> products = category.getProducts();
            System.out.println(products);

        }

        public void getProductList(List<String> uuids){
            List<Category> categories = categoryRepository.findAllById(uuids);
            for(Category category: categories){
                for(Product product: category.getProducts()){
                    System.out.println(product.getTitle());
                }
            }
        }

}
