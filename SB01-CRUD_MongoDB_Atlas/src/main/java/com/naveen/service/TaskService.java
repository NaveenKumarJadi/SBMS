package com.naveen.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naveen.model.Task;
import com.naveen.repository.TaskRepository;

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepository;
	
	//CRUD
	
	public Task addTask(Task task) {
		task.setTaskId(UUID.randomUUID().toString().split("-")[0]);
		return taskRepository.save(task);
	}
	
	public List<Task> findAllTask(){
		return taskRepository.findAll();
	}
	
	public Task getTaskByTaskId(String taskId) {
		return taskRepository.findById(taskId).get();
	}
	
	public List<Task> getTaskBySeverity(int severity){
        return  taskRepository.findBySeverity(severity);
    }

	public List<Task> getTaskByAssignee(String	Assignee) {
		return taskRepository.findByAssignee(Assignee);
	}
	
	public Task updateTask(Task taskRequest) {
		//get the existing document from DB
        // populate new value from request to existing object/entity/document
		
		Task existingTask = taskRepository.findById(taskRequest.getTaskId()).get();
		existingTask.setDescription(taskRequest.getDescription());
		existingTask.setSeverity(taskRequest.getSeverity());
		existingTask.setAssignee(taskRequest.getAssignee());
		existingTask.setStoryPoint(taskRequest.getStoryPoint());
		return taskRepository.save(existingTask);
	}
	
	public String deleteTask(String taskId) {
		taskRepository.deleteById(taskId);
		return taskId + "task deleted from dashboard";
	}
	
}
