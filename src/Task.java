public class Task {
    private String taskName;
    private String taskDescription;
    private boolean taskStatus;
    public Task(String taskName, String taskDescription, boolean taskStatus) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskStatus = false;
    }
    public Task(String taskName, String taskDescription) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
    }
    public String getTaskName() {
        return taskName;
    }
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
    public String getTaskDescription() {
        return taskDescription;
    }
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
    public boolean getTaskStatus() {
        return taskStatus;
    }
    public void setTaskStatus(boolean taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String toString(){
        return taskName+" "+ taskDescription+" "+ taskStatus;
    }

}
