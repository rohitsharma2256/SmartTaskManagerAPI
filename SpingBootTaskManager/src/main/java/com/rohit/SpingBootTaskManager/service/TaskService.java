package com.rohit.SpingBootTaskManager.service;

import com.rohit.SpingBootTaskManager.dto.TaskRequest;
import com.rohit.SpingBootTaskManager.entity.Task;
import com.rohit.SpingBootTaskManager.entity.User;
import com.rohit.SpingBootTaskManager.repository.TaskRepository;
import com.rohit.SpingBootTaskManager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepo;

    @Autowired
    private UserRepository userRepo;

    // Create Task  step
    public Task createTask(TaskRequest req) {
        User user = userRepo.findById(req.getUserId()).orElseThrow();

        Task task = new Task();
        task.setTitle(req.getTitle());
        task.setDescription(req.getDescription());
        task.setStatus(req.getStatus());
        task.setUser(user);

        return taskRepo.save(task);
    }
    // Getting  Tasks by Users
    public List<Task> getTasks(Long userId) {
        return taskRepo.findByUserId(userId);
    }

    public String deleteTask(Long id) {
        taskRepo.deleteById(id);
        return "Task deleted";
    }
    // Update Task
    public Task updateTask(Long id, TaskRequest req) {
        Task task = taskRepo.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));

        task.setTitle(req.getTitle());
        task.setDescription(req.getDescription());
        task.setStatus(req.getStatus());

        return taskRepo.save(task);
    }
    // Mark Task as Complete
    public Task markComplete(Long id) {
        Task task = taskRepo.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));

        task.setStatus("COMPLETED");

        return taskRepo.save(task);
    }
}