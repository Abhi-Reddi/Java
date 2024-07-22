import java.util.ArrayList;

/**
 * ToDoList class that manages a list of tasks.
 */
public class ToDoList {
    private final ArrayList<Task> tasks = new ArrayList<>();

    /**
     * Constructs a new ToDoList.
     */
    public ToDoList() {}

    /**
     * Adds a new task to the to-do list.
     *
     * @param taskName The name of the task.
     * @param taskDescription The description of the task.
     */
    public void addTask(String taskName, String taskDescription) {
        tasks.add(new Task(taskName, taskDescription));
    }

    /**
     * Displays all tasks in the to-do list.
     * If there are no tasks, it prints "No tasks found".
     */
    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + "  " + tasks.get(i).toString());
            }
        }
    }

    /**
     * Marks a task as completed based on its index in the list.
     *
     * @param indexTaskNumber The index of the task to mark as completed (0-based index).
     */
    public void completedTask(int indexTaskNumber) {
        if (indexTaskNumber >= 0 && indexTaskNumber < tasks.size()) {
            tasks.get(indexTaskNumber).setTaskStatus(true);
        } else {
            System.out.println("No tasks found");
        }
    }

    /**
     * Deletes a task from the to-do list based on its index.
     *
     * @param indexTaskNumber The index of the task to delete (0-based index).
     */
    public void deleteTask(int indexTaskNumber) {
        if (indexTaskNumber >= 0 && indexTaskNumber < tasks.size()) {
            tasks.remove(indexTaskNumber);
        } else {
            System.out.println("No tasks found");
        }
    }
}
