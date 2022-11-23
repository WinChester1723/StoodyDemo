package com.example.StoodyDemo.service;

import com.example.StoodyDemo.mapper.CategoryMapper;
import com.example.StoodyDemo.model.dto.CategoryDTO;
import com.example.StoodyDemo.model.entity.Category;
import com.example.StoodyDemo.model.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public List<Category> findAll() {
        var category = categoryRepository.findAll();
//        return CategoryMapper.INSTANCE.entityToDTO(category); // TODO: should be use DTO classes
        return category;
    }

    public List<Category> findAllById(Iterable<Integer> integers){
        return categoryRepository.findAllById(integers);
    }

    public Optional<Category> findById(Integer id) {
        return categoryRepository.findById(id);
    }

    public Category create(Category category){
        return categoryRepository.save(category);
    }

    public void deleteById(Integer i){
        categoryRepository.deleteById(i);
    }

    public void delete(Category category){
        categoryRepository.delete(category);
    }

}
