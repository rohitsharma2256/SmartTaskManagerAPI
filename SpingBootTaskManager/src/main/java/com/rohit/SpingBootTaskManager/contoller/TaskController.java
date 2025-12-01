package com.rohit.SpingBootTaskManager.contoller;

import com.rohit.SpingBootTaskManager.dto.TaskRequest;
import com.rohit.SpingBootTaskManager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    //Create Task
    @PostMapping("/create")
    public ResponseEntity<?> createTask(@RequestBody TaskRequest req) {
        return ResponseEntity.ok(taskService.createTask(req));
    }

    //Get Task
    @GetMapping("/user/{id}")
    public ResponseEntity<?> getTasks(@PathVariable Long id) {
        return ResponseEntity.ok(taskService.getTasks(id));
    }

    //Delete Task
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTask(@PathVariable Long id) {
        return ResponseEntity.ok(taskService.deleteTask(id));
    }
    // Update Task
    @PutMapping("/{id}")
    public ResponseEntity<?> updateTask(@PathVariable Long id, @RequestBody TaskRequest req) {
        return ResponseEntity.ok(taskService.updateTask(id, req));
    }
    // Mark Task as Complete
    @PutMapping("/complete/{id}")
    public ResponseEntity<?> markComplete(@PathVariable Long id) {
        return ResponseEntity.ok(taskService.markComplete(id));
    }
}