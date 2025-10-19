# 📝 TodoApp - Modern Task Management

![Kotlin](https://img.shields.io/badge/Kotlin-2.0-blue.svg)
![Android Studio](https://img.shields.io/badge/Android_Studio-Meerkat_Feature_Drop-brightgreen.svg)

A **lightweight Android To-Do app** built with **Jetpack Compose**, featuring **swipe-to-delete with undo**, task completion tracking, and a clean Material 3 interface. Quickly add, complete, and manage your tasks with a smooth, modern UI.

---

## 📌 Features

- 🆕 **Add, complete, and delete tasks**  
- ↔️ **Swipe-to-delete** tasks with a **Snackbar undo** option  
- ✅ **Task completion tracking** with strikethrough  
- 🎨 Modern **Material 3 UI** with Cards and elevated design  
- ✨ Smooth **animations** for swipe gestures and task updates  
- 🏗️ Clean and modular code architecture:
  - `TaskItem.kt` – Task row component  
  - `SwipeToDeleteItem.kt` – Swipeable task wrapper  
  - `TaskListScreen.kt` – Main screen  
  - `TaskViewModel.kt` – ViewModel 

  - `TaskRepository.kt` – Repository pattern for data  
  - `AppDatabase.kt` – Room database integration  

---

## 📸 Screenshots

<img width="200" height="500" alt="main screen" src="https://github.com/user-attachments/assets/17cfb924-5522-4f86-a88c-53c6dcb9d106" />

<img width="200" height="380" alt="task added" src="https://github.com/user-attachments/assets/8d63ca46-9085-480d-be67-49a8a801bb56" />

<img width="200" height="380" alt="Screenshot 2025-10-19 131400" src="https://github.com/user-attachments/assets/ad76fef3-8836-4b8f-bfe1-d49cf90d730f" />

<img width="200" height="500" alt="Screenshot 2025-10-19 131431" src="https://github.com/user-attachments/assets/2b290205-e520-4c55-9930-8feff96b1884" />

---

## 🛠️ Tech Stack

- 🖋️ Kotlin  
- 🖼️ Jetpack Compose  
- 🎨 Material3 Design  
- 🗄️ Room Database  
- 🔄 Coroutine Flow & ViewModel  
- 🛎️ Snackbar for Undo action  

---

## 🚀 Getting Started

### Prerequisites

- 🛠️ Android Studio Bumblebee or newer  
- 📱 Minimum SDK: 24+  
- 📝 Kotlin 2.0+  

### Installation

1. Clone the repository:
```bash
git clone https://github.com/satwinder9069/TodoApp.git
```
2. Open the project in Android Studio.
3. Sync Gradle and build the project.
4. Run on an emulator or physical device.

---

## ✨ Usage
- ✍️ Enter a task in the input field and tap Add Task.
- ✅ Mark tasks as completed using the checkbox.
- ↔️ Swipe left or right to delete a task.
- ⏪ Tap Undo in the Snackbar to restore a deleted task.

---
## 📂 Project Structure
```
com.example.todoapp
├─ data
|  ├─ dao
|  |  └─ TaskDao.kt
│  ├─ database
│  |  └─ AppDatabase.kt
|  └─ model
│    └─ Task.kt
├─ repository
│    └─ TaskRepository.kt
├─ ui
│  ├─ components
│  │  └─ TaskItem.kt
│  └─ screens
│  |  └─ TaskListScreen.kt
|  └─ theme
│     └─ Color.kt
|     └─ Theme.kt
|     └─ Type.kt
├─ viewmodel
│  └─ TaskViewModel.kt
|  └─ TaskViewModelFactory.kt
└─ MainActivity.kt
```

---
## 🔮 Future Enhancements
  -> ⚡ Add task priority and due date
  
  -> 🌗 Implement dark/light mode toggle
  
  -> 🏷️ Add categories/tags for tasks
  
  -> ⏳ Persistent undo for multiple tasks
  
  -> 🔔 Notifications for overdue tasks
  
  -> ✨ Experiment with **animations and UI polish**
  
 ---
  
