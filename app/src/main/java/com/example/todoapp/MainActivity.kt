package com.example.todoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.todoapp.data.database.AppDatabase
import com.example.todoapp.repository.TaskRepository
import com.example.todoapp.ui.screens.TaskListScreen
import com.example.todoapp.ui.theme.TodoAppTheme
import com.example.todoapp.viewmodel.TaskViewModel
import com.example.todoapp.viewmodel.TaskViewModelFactory

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            // Initialize Database & Repository
            val db = AppDatabase.getDatabase(this)
            val repository = TaskRepository(db.taskDao())

            // Create ViewModel with Factory
            val factory = TaskViewModelFactory(repository)
            val taskViewModel: TaskViewModel = viewModel(factory = factory)
            TodoAppTheme {
                TaskListScreen(viewModel = taskViewModel)
            }
        }
    }
}