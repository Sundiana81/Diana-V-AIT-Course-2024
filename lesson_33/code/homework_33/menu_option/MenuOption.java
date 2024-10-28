package homework_33.menu_option;

public enum MenuOption {

    ADD_TASK(1, "Add a task"),
    VIEW_TASKS(2, "View all tasks"),
    DELETE_TASK(3, "Delete a task (by number)"),
    EXIT(4, "Exit the menu");

    private final int number;
    private final String description;

    MenuOption(int number, String description) {
        this.number = number;
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MenuOptions{");
        sb.append("number=").append(number);
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static MenuOption fromNumber(int number) {
        for (MenuOption option : MenuOption.values()) {
            if (option.getNumber() == number) {
                return option;
            }
        }
        return null;
    }
}
