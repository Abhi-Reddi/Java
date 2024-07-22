/**
 * Task class that represents a single task in the to-do list.
 */
public class Task {
    private String taskName;
    private String taskDescription;
    private boolean taskStatus;

    /**
     * Constructs a new Task with the specified name, description, and status.
     *
     * @param taskName The name of the task.
     * @param taskDescription The description of the task.
     * @param taskStatus The status of the task, where false indicates incomplete.
     */
    public Task(String taskName, String taskDescription, boolean taskStatus) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskStatus = false;
    }

    /**
     * Constructs a new Task with the specified name and description.
     * The task status is set to false (incomplete) by default.
     *
     * @param taskName The name of the task.
     * @param taskDescription The description of the task.
     */
    public Task(String taskName, String taskDescription) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
    }

    /**
     * Returns the name of the task.
     *
     * @return The name of the task.
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * Sets the name of the task.
     *
     * @param taskName The new name of the task.
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    /**
     * Returns the description of the task.
     *
     * @return The description of the task.
     */
    public String getTaskDescription() {
        return taskDescription;
    }

    /**
     * Sets the description of the task.
     *
     * @param taskDescription The new description of the task.
     */
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    /**
     * Returns the status of the task.
     *
     * @return true if the task is completed, false otherwise.
     */
    public boolean getTaskStatus() {
        return taskStatus;
    }

    /**
     * Sets the status of the task.
     *
     * @param taskStatus The new status of the task.
     */
    public void setTaskStatus(boolean taskStatus) {
        this.taskStatus = taskStatus;
    }

    /**
     * Returns a string representation of the task.
     *
     * @return A string containing the task name, description, and status.
     */
    @Override
    public String toString() {
        return taskName + " " + taskDescription + " " + taskStatus;
    }
}
