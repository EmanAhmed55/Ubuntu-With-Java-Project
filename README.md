#  File Management and Process Utilities

## Project Description

This project implements a program that allows users to:
- Change file permissions (all types and combinations)
- Create symbolic link files
- Save current process IDs to a file and open them in a text editor

It provides a terminal-based interface and a Graphical User Interface (GUI) menu that lets users select tasks. The project can be executed from any directory in the terminal and can also accept DOS commands for file compression.

## Features

- **File Permissions Management:** Change the permissions of files (all types and combinations).
- **Symbolic Links Creation:** Create symbolic links for files and directories.
- **Process ID Management:** Save current process IDs to a file and open it in a text editor.
- **Terminal Support:** Run the program from any directory using the terminal.
- **GUI Interface:** A GUI menu that allows the user to choose between different tasks.
- **Task Continuity:** After completing one task, the GUI reappears until the user selects "exit."
- **Manual Page:** The project has a manual page that can be accessed via the `man project4` command in the terminal.
- **DOS Command Arguments:** The program can accept DOS commands as arguments. For example, it can compress a file in a specific path or run the `ls` command to list files.

## Usage

1. **Running the Program:**
   - From the terminal, type `project4` to launch the GUI menu:
     ```
     pc@pc-virtualbox:~# project4
     ```
   - The GUI will allow you to select the desired task.

2. **Using DOS Commands (Terminal Mode):**
   - The project also accepts DOS commands as arguments. For example:
     ```
     pc@pc-virtualbox:~# project4 dir
     ```
   - This command will run the `ls` command in the terminal and display the results.

3. **Closing the Project:**
   - After completing a task in the GUI, the menu will remain open until the user selects "Exit."

## Requirements

- **Java 8+**: Ensure that Java is installed on your system to run the project.
- **Operating System**: Linux/Unix-based OS recommended.


