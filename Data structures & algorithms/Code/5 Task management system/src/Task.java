public class Task {
    int taskid;
    String taskname;
    String status;
    Task next;

    public Task(int taskid,String taskname,String status){
        this.taskid=taskid;
        this.taskname=taskname;
        this.status=status;
        this.next=null;
    }
}
