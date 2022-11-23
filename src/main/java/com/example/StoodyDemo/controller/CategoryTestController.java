package com.example.StoodyDemo.controller;

import com.example.StoodyDemo.model.entity.Category;
import com.example.StoodyDemo.model.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
public class CategoryTestController {

    private final CategoryRepository categoryRepository;

    @PostMapping("/create")
    public Category create(@RequestBody Category category) {
        return categoryRepository.save(category);
    }

    @GetMapping("/show-all")
    public List<Category> findALl() {
        return categoryRepository.findAll();
    }

    @GetMapping("/show-all/id/{id}")
    public Optional<Category> findById(@PathVariable("id")Integer id){
        return categoryRepository.findById(id);
    }

    @DeleteMapping("/delete-category")
    public void deleteCategory(@RequestBody Category category){
        categoryRepository.delete(category);
    }

    @DeleteMapping("/delete-category/id/{id}")
    public void deleteById(@PathVariable Integer id){
        categoryRepository.deleteById(id);
    }

}
