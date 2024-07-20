import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList list = new ToDoList();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String name = input.nextLine();
                    System.out.print("Enter task description: ");
                    String description = input.nextLine();
                    list.addTask(name, description);
                    break;
                case 2:
                    list.viewTasks();
                    break;
                case 3:
                    System.out.print("Enter task index to mark as completed: ");
                    int taskIndexToComplete = input.nextInt();
                    list.completedTask(taskIndexToComplete - 1);
                    break;
                case 4:
                    System.out.print("Enter task index to delete: ");
                    int taskIndexToDelete = input.nextInt();
                    list.deleteTask(taskIndexToDelete - 1);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}