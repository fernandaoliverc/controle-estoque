package com.estoque.repository;
import org.springframework.data.repository.CrudRepository;

import com.estoque.entity.Estoque;

public interface EstoqueRepository extends CrudRepository<Estoque, Integer>  {

}
