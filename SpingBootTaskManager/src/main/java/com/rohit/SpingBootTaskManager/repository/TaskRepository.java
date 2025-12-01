package com.rohit.SpingBootTaskManager.repository;


import com.rohit.SpingBootTaskManager.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByUserId(Long userId);
}