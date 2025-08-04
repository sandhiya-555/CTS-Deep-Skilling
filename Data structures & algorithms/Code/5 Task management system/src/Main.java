public class Main {
    public static void main(String[] args) {

        TaskManager manager= new TaskManager();

        manager.addtask(new Task(10,"Printing","completed"));
        manager.addtask(new Task(20,"Scanning","inProgress"));
        manager.addtask(new Task(30,"Displaying","pending"));

        manager.displaytasks();
        manager.searchtask(20);
        manager.deleteTask(20);
        manager.displaytasks();
        manager.deleteTask(20);
    }
}