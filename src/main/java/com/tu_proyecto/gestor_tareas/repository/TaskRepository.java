package com.tu_proyecto.gestor_tareas.repository;

import com.tu_proyecto.gestor_tareas.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByUserId(Long userId);
}