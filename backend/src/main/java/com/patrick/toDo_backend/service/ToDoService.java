package com.patrick.toDo_backend.service;

import com.patrick.toDo_backend.model.ToDo;
import com.patrick.toDo_backend.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ToDoService {

    @Autowired
    private ToDoRepository toDoRepository;

    public List<ToDo> findAll() {
        return toDoRepository.findAll();
    }

    public Optional<ToDo> findById(Integer id){
        return toDoRepository.findById(id);
    }

    public ToDo save(ToDo toDo){
        toDo.setCriado_em(LocalDate.now());
        return toDoRepository.save(toDo);
    }

    public boolean deleteById(Integer id){
        if(toDoRepository.existsById(id)){
            toDoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Optional<ToDo> update(Integer id, ToDo descricao){
        Optional<ToDo> exists = toDoRepository.findById(id);
        if(exists.isPresent()){
            ToDo update = exists.get();
            update.setDescricao(descricao.getDescricao());
            return Optional.of(toDoRepository.save(update));
        }
        return Optional.empty();
    }
}
