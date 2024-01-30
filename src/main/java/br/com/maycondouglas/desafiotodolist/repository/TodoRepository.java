package br.com.maycondouglas.desafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maycondouglas.desafiotodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}