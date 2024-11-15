package classwork_46.ait.todolist;

import classwork_46.ait.todolist.dao.ToDoListImpl;
import classwork_46.ait.todolist.model.Task;
import classwork_46.ait.todolist.view.Menu;

import java.io.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ToDoListAppl implements Serializable{

    public static final String FILE_NAME = "task_list.dat";

    public static void main(String[] args) {
        // greeting
        System.out.println("Welcome to ToDo Application!");

        ToDoListImpl toDoList = new ToDoListImpl(); // object
        LocalDate now = LocalDate.now();
        Scanner scanner = new Scanner(System.in);

        // начало цикла
        while (true) {
            // print menu
            Menu.printMenu(); // статический метод вызывается по имени класса
            // ask choice
            System.out.println("Input your choice: ");
            int choice = scanner.nextInt();
            // execute
            switch (choice) {
                case 1: {
                    scanner.nextLine();
                    System.out.println("Input task: ");
                    String task = scanner.nextLine();
                    Task t = new Task(task, now);
                    toDoList.addTask(t);
                    break;
                }
                case 2: {
                    System.out.println("Your tasks: ");
                    toDoList.viewTasks();
                    break;
                }
                case 3: {
                    System.out.println("Input task number: ");
                    int taskNumber = scanner.nextInt();
                    toDoList.removeTask(taskNumber);
                    break;
                }
                case 4: {
                    System.out.println("Saving... ");
                    // call method
                    toDoList.saveTasks(FILE_NAME);
                    break;
                }
                case 5:{
                    // call method
                    System.out.println("Loading... ");
                    toDoList.loadTasks(FILE_NAME);
                    break;
                }
                case 6:
                    return;
                default: {
                    System.out.println("Wrong input.");
                }
            }
        }
    }
}




