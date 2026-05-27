package com.generation.lojadegames.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.generation.lojadegames.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
    // Método personalizado para buscar por tipo (igual ao buscar por nome do modelo de usuário)
    public List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);
}