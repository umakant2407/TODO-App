package com.example.todoapp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Cacheable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.todoapp.model.Task;
import com.example.todoapp.service.TaskService;

@RestController
@RequestMapping("/Todo")
public class TaskController {
	
	@Autowired
	private TaskService taskService;
	
	ArrayList<Task> list= new ArrayList<>();
	
	//Finding all Task
	@GetMapping("/")
	public  List<Task> findAllTask(){
		return this.taskService.findAllTask();
	}
	
	//Adding task
	@PostMapping("/")
	public Task addTask( @RequestBody Task task) {
		return this.taskService.saveTask(task);
	}
	
	//updating Task
	@PutMapping("/")
	public Task updateTask(@RequestBody Task task) {
		return this.taskService.updateTask(task);
	}
	
	
	//Deleting Task
	@DeleteMapping("/{Id}")
	public void Delete(@PathVariable Integer Id) {
		this.taskService.deleteTask(Id);
	}
}
