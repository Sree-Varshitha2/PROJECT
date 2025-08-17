
import java.util.ArrayList;

class Task {

    String name;
    boolean isCompleted;

    public Task(String name, boolean isCompleted) {
        this.name = name;
        this.isCompleted = isCompleted;
    }
}

public class TaskManager {

    public static void main(String[] args) {

        ArrayList<Task> tasks = new ArrayList<>();

        tasks.add(new Task("Buy groceries", true));
        tasks.add(new Task("Complete homework", false));
        tasks.add(new Task("Pay bills", false));
        tasks.add(new Task("Call mom", true));
        tasks.add(new Task("Clean room", false));

        int totalTasks = tasks.size();
        int completed = 0;
        int pending = 0;

        for (Task task : tasks) {
            if (task.isCompleted) {
                completed++;
            } else {
                pending++;
            }
        }

        System.out.println("Total Tasks: " + totalTasks);
        System.out.println("Completed: " + completed);
        System.out.println("Pending: " + pending);
    }
}
