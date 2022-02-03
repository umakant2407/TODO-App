package com.example.todoapp.service;

import java.util.List;
import com.example.todoapp.model.Task;

public interface TaskService {

	public  List<Task> findAllTask(); 
	
	public  Task saveTask(Task task);
	
	public  Task updateTask(Task task);
	
	public  void deleteTask(Integer Id);
}
