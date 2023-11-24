package com.imouahrani.gestiondestock.repository;

import java.util.Optional;

import com.imouahrani.gestiondestock.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

  Optional<Category> findCategoryByCode(String code);

}
