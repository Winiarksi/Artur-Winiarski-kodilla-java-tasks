package com.crud.tasks.controller;

import com.crud.tasks.domain.TaskDto;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
/*adnotacja mówiąca Springowi, aby utworzył w kontekście aplikacji Controller wraz z niezbędnym ResponseBody,
 który jest charakterystyczny dla aplikacji webowych.
 Odpowiedź Controllera domyślnie jest w formacie JSON.
 Przyda nam się to już za chwilę.
*/
@RequestMapping("/v1/task")
public class TaskController {

    @RequestMapping(method = RequestMethod.GET, value = "getTasks")
    public List<TaskDto> getTasks(){
        return new ArrayList<>();
    }

    @RequestMapping(method = RequestMethod.GET, value = "getTask")
    public TaskDto getTask(String taskId){
        return new TaskDto((long)1, "test title", "test_content");
    }

    @RequestMapping(method = RequestMethod.GET, value = "deleteTask")
    public void deleteTask(String taskId){
    }

    @RequestMapping(method = RequestMethod.GET, value = "updateTask")
    public TaskDto updateTask(TaskDto task){
        return new TaskDto((long)1, "Edited test title", "Test content");
    }

    @RequestMapping(method = RequestMethod.GET, value = "createTask")
    public void createTask(TaskDto taskDto){

    }
}
