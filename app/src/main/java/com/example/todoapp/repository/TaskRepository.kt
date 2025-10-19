package com.example.todoapp.repository

import com.example.todoapp.data.dao.TaskDao
import com.example.todoapp.data.model.Task
import kotlinx.coroutines.flow.Flow

class TaskRepository(private val dao: TaskDao) {
    val allTasks: Flow<List<Task>> = dao.getAllTasks()

    suspend fun addTask(task: Task) = dao.addTask(task)
    suspend fun updateTask(task: Task) = dao.updateTask(task)
    suspend fun deleteTask(task: Task) = dao.deleteTask(task)
}