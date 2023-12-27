package com.gefersonholdorf.dscatalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gefersonholdorf.dscatalog.entities.Category;
import com.gefersonholdorf.dscatalog.repositories.CategoryRepository;

@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        List<Category> list = categoryRepository.findAll();

        return list;
    }
}
