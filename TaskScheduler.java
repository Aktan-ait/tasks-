import java.util.*;

class Task implements Comparable<Task> {
    String taskName;
    int priority;
    int duration;

    public Task(String taskName, int priority, int duration) {
        this.taskName = taskName;
        this.priority = priority;
        this.duration = duration;
    }

    @Override
    public int compareTo(Task other) {
        if (this.priority != other.priority) {
            return Integer.compare(other.priority, this.priority);
        }
        return Integer.compare(this.duration, other.duration);
    }

    @Override
    public String toString() {
        return "[Priority " + priority + "] " + taskName + " (Duration: " + duration + " mins)";
    }
}

class TaskManager {
    private PriorityQueue<Task> taskQueue = new PriorityQueue<>();
    private Queue<Task> pendingTasks = new LinkedList<>();

    public void addTask(String name, int priority, int duration) {
        taskQueue.offer(new Task(name, priority, duration));
    }

    public void processTask() {
        if (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            System.out.println("Processing Task: " + task);
        } else if (!pendingTasks.isEmpty()) {
            Task task = pendingTasks.poll();
            System.out.println("Processing Pending Task: " + task);
        } else {
            System.out.println("No tasks to process.");
        }
    }

    public void delayTask(String taskName) {
        Iterator<Task> iterator = taskQueue.iterator();
        while (iterator.hasNext()) {
            Task task = iterator.next();
            if (task.taskName.equals(taskName)) {
                iterator.remove();
                pendingTasks.offer(task);
                System.out.println("Delaying Task: " + taskName);
                return;
            }
        }
    }

    public void displayTasks() {
        System.out.println("\nScheduled Tasks (sorted by priority):");
        if (taskQueue.isEmpty()) {
            System.out.println("(No priority tasks)");
        } else {
            taskQueue.forEach(System.out::println);
        }
        System.out.println("\nPending Tasks (FIFO Order):");
        if (pendingTasks.isEmpty()) {
            System.out.println("(No pending tasks)");
        } else {
            pendingTasks.forEach(System.out::println);
        }
    }
}



