# Task Tracker CLI

A simple command-line task management tool built in Java. Add, list, and delete tasks right from your terminal — all tasks are automatically saved to a file so they persist between sessions.

## Features

- **Add tasks** with a title
- **List** all tasks with their ID, title, status, and creation date
- **Delete tasks** by ID
- **Auto-save and auto-load** — tasks are saved to `tasks.txt` and loaded automatically when the app starts
- Simple, interactive command-line interface

## Tech Stack

- Java (no external libraries or frameworks)

## How to Run

1. Clone the repository
   ```bash
   git clone https://github.com/shvmmonk/Task-Tracker-CLI.git
   cd Task-Tracker-CLI
   ```

2. Compile the source files
   ```bash
   javac src/*.java
   ```

3. Run the app
   ```bash
   java src.Main
   ```

## Usage

Once running, type commands at the `>` prompt:

| Command | Description |
|---|---|
| `add <title>` | Add a new task |
| `list` | View all tasks |
| `delete <id>` | Delete a task by its ID |
| `help` | Show all available commands |
| `exit` | Quit the application |

### Example session

```
===Task Tracker CLI===
Type 'Help' to see the commands. Type 'Exit' to quit.

>add Finish DSA sheet
Task added:[1]Finish DSA sheet | TODO | 2026-06-20

>list
[1]Finish DSA sheet | TODO | 2026-06-20

>delete 1
Task deleted

>exit
Good Bye
```

## Project Structure

```
src/
├── Main.java         # Entry point, handles user input and command routing
├── Task.java          # Task model (id, title, status, createdAt)
└── TaskManager.java   # Business logic: add, list, delete, save, load
```

## Future Improvements

- Mark tasks as "Done" instead of just deleting them
- Filter tasks by status
- Add due dates and priorities
