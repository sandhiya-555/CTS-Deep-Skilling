public class TaskManager {
    Task head;

    public void addtask(Task task){
        if(head==null){
            head=task;
        }else{
            Task curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=task;
        }
        System.out.println("Task added: "+task.taskid);
    }

    public void searchtask(int id){
        Task curr=head;
        if(head==null){
            System.out.println("No task");
        }
        else{
            while(curr!=null){
                if(curr.taskid==id){
                    System.out.println("Found task:"+curr.taskname);
                    return;
                }
                curr=curr.next;
            }

        }
    }

    public void displaytasks(){
        Task curr=head;

        if(curr==null){
            System.out.println("No tasks ");
            return;
        }else{
            while(curr!=null){
                System.out.println("Id: "+curr.taskid+" Taskname: "+curr.taskname+" Status: "+curr.status);
                curr=curr.next;
            }
        }
    }

    public void deleteTask(int id){
        if(head==null){
            System.out.println("No task is found");
        }

        Task prev=null;
        Task curr=head;

        while(curr!=null && curr.taskid!=id){
            prev=curr;
            curr=curr.next;
        }
        if(curr!=null) {
            prev.next = curr.next;
        }
        else{
            System.out.println("No such task exists");
        }
    }

}
