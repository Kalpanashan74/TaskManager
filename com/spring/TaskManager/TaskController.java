package com.spring.TaskManager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/tasks")
public class TaskController {

	@Autowired
	private TaskService taskService;
	
	@GetMapping
	public List<Task> getAllTasks(){
		return taskService.getAllTasks();
	}
	@GetMapping("/{id}")
	public ResponseEntity<Task> getTaskById(@Valid @PathVariable Integer id) {
		Task task = taskService.getTaskById(id);
		return ResponseEntity.ok(task);
	}
	
	@PostMapping
	public Task createTask(@Valid @RequestBody Task task) {
		return taskService.saveTask(task);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Task> updateTask(@Valid @PathVariable Integer id, @RequestBody Task UpdatedTask){
		Task task = taskService.updateTask(id, UpdatedTask);
		return ResponseEntity.ok(task);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteTask(@Valid @PathVariable Integer id){
		taskService.deleteTaskById(id);
		return ResponseEntity.ok("Task Deleted Successfully!");
	}
}
