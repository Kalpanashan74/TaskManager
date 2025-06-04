package com.spring.TaskManager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;
    
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
    
    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }
    
    public Task getTaskById(Integer id) {
        return taskRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Task can't be found"));
    }
    
    public Task updateTask(Integer id, Task updatedTask) {
        Task existing = taskRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Task can't be found"));
        
        existing.setDescription(updatedTask.getDescription());
        existing.setDuedate(updatedTask.getDuedate());
        existing.setTitle(updatedTask.getTitle());
        existing.setStatus(updatedTask.isStatus());
        
        return taskRepository.save(existing);  // save the updated existing task, NOT updatedTask
    }
    
    public void deleteTaskById(Integer id) {
        if (!taskRepository.existsById(id)) {
            throw new RuntimeException("Task doesn't exist");
        }
        taskRepository.deleteById(id);
    }
}
