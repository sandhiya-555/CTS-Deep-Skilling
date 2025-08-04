public class Main {
    public static void main(String[] args) {

        Student student1= new Student("Yash",10,"A+");
        Studentview view= new Studentview();

        Controller controller = new Controller(student1,view);

        controller.displaydetails();

        controller.Setname("Saran");
        controller.Setid(11);
        controller.displaydetails();

    }
}