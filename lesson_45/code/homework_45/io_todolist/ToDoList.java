package homework_45.io_todolist;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

    public class ToDoList {
        private List<Task> tasks = new ArrayList<>();

        public void addTask(String description) {
            tasks.add(new Task(description));
        }

        public List<Task> getTasks() {
            return tasks;
        }

        public void saveTasksToFile(String fileName) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
                oos.writeObject(tasks);

                System.out.println("Tasks have been saved to " + fileName);
            } catch (IOException e) {

                System.out.println("Error saving tasks: " + e.getMessage());
            }
        }
    }


