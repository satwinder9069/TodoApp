package com.example.todoapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.todoapp.data.model.Task
import com.example.todoapp.repository.TaskRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class TaskViewModel(private val repository: TaskRepository) : ViewModel() {

    val tasks: StateFlow<List<Task>> = repository.allTasks
        .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    fun addTask(title: String) = viewModelScope.launch {
        repository.addTask(Task(title = title))
    }

    fun toggleTaskDone(task: Task) = viewModelScope.launch {
        repository.updateTask(task.copy(isDone = !task.isDone))
    }

    fun deleteTask(task: Task) = viewModelScope.launch {
        repository.deleteTask(task)
    }

    fun restoreTask(task: Task) {
        viewModelScope.launch {
            repository.addTask(task)
        }
    }
}