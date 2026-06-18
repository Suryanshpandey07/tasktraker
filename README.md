# Task Tracker CLI

A simple Command Line Interface (CLI) application to track and manage tasks. This project allows users to create, update, delete, and manage tasks directly from the terminal while storing data in a local JSON file.

## Features

- Add new tasks
- Update existing tasks
- Delete tasks
- Mark tasks as todo, in-progress, or done
- List all tasks
- Filter tasks by status
- Persistent storage using a JSON file
- Automatic task ID generation
- Automatic timestamp tracking

## Task Properties

Each task contains the following fields:

| Property | Description |
|-----------|-------------|
| id | Unique task identifier |
| description | Short task description |
| status | todo, in-progress, or done |
| createdAt | Task creation timestamp |
| updatedAt | Last update timestamp |

Example:

json {   "id": 1,   "description": "Buy groceries",   "status": "todo",   "createdAt": "2026-06-19T01:12:44",   "updatedAt": "2026-06-19T01:12:44" } 

---

## Project Structure

tasktracker/ │ ├── tasktracker/ │   ├── manager.java │   └── Task.java │ ├── tasks.json └── README.md

---

## Requirements

- Java 8 or higher
- No external libraries required

---

## Compilation

Compile the project from the root directory:

bash javac tasktracker/*.java 

---

## Usage

### Add a Task

bash java -cp . tasktracker.manager add "Buy milk" 

Output:

bash Task added successfully ID: 1 Status: todo 

---

### Update a Task

bash java -cp . tasktracker.manager update 1 "Buy milk and bread" 

Output:

bash Task updated successfully 

---

### Delete a Task

bash java -cp . tasktracker.manager delete 1 

Output:

bash Task deleted successfully 

---

### Mark Task as In Progress

bash java -cp . tasktracker.manager mark-in-progress 1 

Output:

bash Task marked as in-progress 

---

### Mark Task as Done

bash java -cp . tasktracker.manager mark-done 1 

Output:

bash Task marked as done 

---

### List All Tasks

bash java -cp . tasktracker.manager list 

Example Output:

bash ID: 1 Description: Buy milk Status: todo 

---

### List Tasks by Status

#### Todo Tasks

bash java -cp . tasktracker.manager list todo 

#### In Progress Tasks

bash java -cp . tasktracker.manager list in-progress 

#### Completed Tasks

bash java -cp . tasktracker.manager list done 

---

## Data Storage

All tasks are stored in a local file named:

bash tasks.json 

The file is automatically created when the first task is added.

---

## Error Handling

The application handles:

- Missing arguments
- Invalid task IDs
- Empty descriptions
- Non-existent tasks
- Missing JSON file
- Invalid commands

Example:

bash Task with ID 10 not found. 

---

## Example Workflow

bash java -cp . tasktracker.manager add "Buy groceries"  java -cp . tasktracker.manager add "Complete project"  java -cp . tasktracker.manager mark-in-progress 2  java -cp . tasktracker.manager mark-done 2  java -cp . tasktracker.manager list done 

---

## Future Improvements

- Task priorities
- Due dates
- Search functionality
- Categories and tags
- Colored terminal output
- Export to CSV

---

## Author

Suryansh Pandey

Built as part of the Task Tracker CLI project to practice Java, file handling, JSON processing, and command-line application development.
helpedby-https://roadmap.sh/projects/task-tracker
