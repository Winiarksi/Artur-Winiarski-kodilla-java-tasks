package com.crud.tasks.controller;

import com.crud.tasks.domain.Task;
import com.crud.tasks.domain.TaskDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/task")
public class TaskController {


    @RequestMapping(method = RequestMethod.GET, value = "getTasks")
    public List<TaskDto> getTasks(){
        List<TaskDto> x = new ArrayList<>();
        x.add(new TaskDto((long)2, "222", "111"));
        x.add(new TaskDto((long)3, "333", "333"));
        x.add(new TaskDto((long)4, "4444", "444"));
        x.add(new TaskDto((long)5, "555", "111"));
        x.add(new TaskDto((long)6, "666", "111"));
        return x;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getTask")
    public TaskDto getTask(String taskId){
        return new TaskDto((long)1, "Zakupy", "test_content");
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteTask")
    public void deleteTask(String taskId){
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateTask")
    public TaskDto updateTask(TaskDto taskDto){
        return new TaskDto((long)1, "Edited test title", "Test content");
    }

    @RequestMapping(method = RequestMethod.POST, value = "createTask")
    public void createTask(TaskDto taskDto){
    }
}
