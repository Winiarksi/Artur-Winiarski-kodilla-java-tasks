package com.crud.tasks.service;

import com.crud.task.repository.TaskRepository;
import com.crud.tasks.domain.Task;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DbService {
    @Autowired
    private TaskRepository repository;

    public List<Task> getAllTasks(){    // getAllTasks - która będzie “opakowaniem” dla wywołania metody findAll() z TaskRepository,
        return repository.findAll();
    }
}
