import java.util.Scanner;

/**
 * Main class that drives the To-Do List application.
 */
public class Main {
    public static void main(String[] args) {
        ToDoList list = new ToDoList();
        Scanner input = new Scanner(System.in);

        // Create a centered heading
        String heading = "To-Do List";
        int width = 50; // Width of the console output
        String centeredHeading = String.format("%" + ((width - heading.length()) / 2) + "s%s%" + ((width - heading.length()) / 2) + "s", "", heading, "");

        // Main loop to display menu and process user input
        while (true) {
            // Display the menu with the centered heading
            System.out.println(centeredHeading);
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            // Get user choice
            int choice = input.nextInt();
            input.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add a new task
                    System.out.print("Enter task name: ");
                    String name = input.nextLine();
                    System.out.print("Enter task description: ");
                    String description = input.nextLine();
                    list.addTask(name, description);
                    break;
                case 2:
                    // View all tasks
                    list.viewTasks();
                    break;
                case 3:
                    // Mark a task as completed
                    System.out.print("Enter task index to mark as completed: ");
                    int taskIndexToComplete = input.nextInt();
                    list.completedTask(taskIndexToComplete - 1);
                    break;
                case 4:
                    // Delete a task
                    System.out.print("Enter task index to delete: ");
                    int taskIndexToDelete = input.nextInt();
                    list.deleteTask(taskIndexToDelete - 1);
                    break;
                case 5:
                    // Exit the application
                    System.out.println("Exiting...");
                    input.close();
                    return;
                default:
                    // Handle invalid choices
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}