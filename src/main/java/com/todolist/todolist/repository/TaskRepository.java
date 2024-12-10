package com.todolist.todolist.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.todolist.todolist.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}
