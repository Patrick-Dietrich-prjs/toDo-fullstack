package com.patrick.toDo_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.patrick.toDo_backend.model.toDo;

public interface toDoRepository extends JpaRepository<toDo, Integer> {
}
