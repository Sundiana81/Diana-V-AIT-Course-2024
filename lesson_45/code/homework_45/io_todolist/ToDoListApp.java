package homework_45.io_todolist;

    public class ToDoListApp {
        public static void main(String[] args) {
            ToDoList todoList = new ToDoList();
            todoList.addTask("Buy groceries");
            todoList.addTask("Call the bank");
            todoList.addTask("Call at school");

            // Сохраняем задачи в файл
            todoList.saveTasksToFile("tasks.dat");
        }
    }


