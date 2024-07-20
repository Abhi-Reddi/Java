import java.util.ArrayList;

public class ToDoList {
    private final ArrayList<Task> task= new ArrayList<>();

    public ToDoList(){}
    public void addTask(String taskName, String taskDescription){
        task.add(new Task(taskName, taskDescription));
    }
    public void viewTasks(){
        if(task.isEmpty()){
            System.out.println("No tasks found");
        }
        else{
            for(int i=0; i<task.size(); i++){
                System.out.println((i+1)+"  "+task.get(i).toString());
            }
        }
    }
    public void completedTask(int indexTaskNumber){
        if ( indexTaskNumber>=0&&indexTaskNumber<task.size()){
            task.get(indexTaskNumber).setTaskStatus(true);
        }
        else {
            System.out.println("No tasks found");
        }
    }
    public void deleteTask(int indexTaskNumber){
        if ( indexTaskNumber>=0&&indexTaskNumber<task.size()){
            task.remove(indexTaskNumber);
        }
        else{
            System.out.println("No tasks found");
        }
    }
}
