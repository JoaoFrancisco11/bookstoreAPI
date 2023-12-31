package com.bookstore.api.repository;

import com.bookstore.api.models.Autores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutoresRepository extends JpaRepository<Autores, Integer> {
    List<Autores> findByNome(String nome);
}
