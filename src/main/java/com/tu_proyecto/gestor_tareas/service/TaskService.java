package com.tu_proyecto.gestor_tareas.service;

import com.tu_proyecto.gestor_tareas.model.Task;
import com.tu_proyecto.gestor_tareas.model.User;
import com.tu_proyecto.gestor_tareas.repository.TaskRepository;
import com.tu_proyecto.gestor_tareas.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public void createTask(Task task, String username) {
        User user = userRepository.findByUsername(username).orElseThrow();
        task.setUser(user);
        taskRepository.save(task);
    }
}