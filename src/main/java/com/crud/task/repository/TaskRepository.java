package com.crud.task.repository;

import com.crud.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;
//rudRepository, która jest udostępniana w bibliotekach springframework i udostępnia metody oraz logikę pobierania danych z bazy danych.

import java.util.List;

public interface TaskRepository extends CrudRepository<Task, Long> {   //  “wie” w jaki sposób operować na bazie danych
    @Override
    List<Task> findAll();
}
