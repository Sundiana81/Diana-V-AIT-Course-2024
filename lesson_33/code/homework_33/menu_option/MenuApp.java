package homework_33.menu_option;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuApp {

        private static List<String> tasks = new ArrayList<>();

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean exit = false;

            while (!exit) {
                Menu.printMenu();
                int choice = scanner.nextInt();
                MenuOption option = MenuOption.fromNumber(choice);

                if (option == null) {
                    System.out.println("Invalid option. Please try again.");
                    continue;
                }

                switch (option) {
                    case ADD_TASK:
                        System.out.print("Enter a task: ");
                        scanner.nextLine();
                        String task = scanner.nextLine();
                        tasks.add(task);
                        System.out.println("Task added.");
                        break;

                    case VIEW_TASKS:
                        System.out.println("Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                        break;

                    case DELETE_TASK:
                        System.out.print("Enter the task number to delete: ");
                        int taskNumber = scanner.nextInt();
                        if (taskNumber > 0 && taskNumber <= tasks.size()) {
                            tasks.remove(taskNumber - 1);
                            System.out.println("Task deleted.");
                        } else {
                            System.out.println("Invalid task number.");
                        }
                        break;

                    case EXIT:
                        System.out.println("Exiting the menu. Goodbye!");
                        exit = true;
                        break;
                }
            }
            scanner.close();
        }
    }


