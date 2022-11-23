package com.example.StoodyDemo.controller;

import com.example.StoodyDemo.model.entity.Category;
import com.example.StoodyDemo.model.repository.CategoryRepository;
import com.example.StoodyDemo.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
public class CategoryTestController {
    @Autowired
    private final CategoryService categoryService;

    @PostMapping("/create")
    public Category create(@RequestBody Category category) {
        return categoryService.create(category);
    }

    @GetMapping("/show-all")
    public List<Category> findALl() {
        return categoryService.findAll();
    }

    @GetMapping("/show-all/id/{id}")
    public Optional<Category> findById(@PathVariable("id")Integer id){
        return categoryService.findById(id);
    }

    @PostMapping("/delete-category")
    public void deleteCategory(@RequestBody Category category){
        categoryService.delete(category);
    }

    @PostMapping("/delete-category/id/{id}")
    public void deleteById(@PathVariable Integer id){
        categoryService.deleteById(id);
    }

}
