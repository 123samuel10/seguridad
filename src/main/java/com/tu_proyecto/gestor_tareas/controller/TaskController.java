package com.tu_proyecto.gestor_tareas.controller;

import com.tu_proyecto.gestor_tareas.model.Task;
import com.tu_proyecto.gestor_tareas.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/public")
    public List<Task> getPublicTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping
    public String createTask(@RequestBody Task task, Authentication authentication) {
        taskService.createTask(task, authentication.getName());
        return "Tarea creada";
    }
}