package com.example.todoapp.service.implementation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todoapp.model.Task;
import com.example.todoapp.repository.TaskRepo;
import com.example.todoapp.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService{
	
	
	@Autowired
	private TaskRepo taskRepo;

	@Override
	public List<Task> findAllTask() {
		// TODO Auto-generated method stub
		return taskRepo.findAll();
	}

	@Override
	public Task saveTask(Task task) {
		// TODO Auto-generated method stub
		return taskRepo.save(task);
	}

	@Override
	public Task updateTask(Task task) {
		// TODO Auto-generated method stub
		return taskRepo.save(task);
	}

	@Override
	public void deleteTask(Integer Id) {
		// TODO Auto-generated method stub
		taskRepo.deleteById(Id);
	}
	
}
