package homework_33.menu_option;

    public class Menu {
        public static void printMenu() {
            System.out.println("To-Do List Menu:");
            for (MenuOption option : MenuOption.values()) {
                System.out.println(option.getNumber() + ". " + option.getDescription());
            }
            System.out.print("Select an option: ");
        }
    }


