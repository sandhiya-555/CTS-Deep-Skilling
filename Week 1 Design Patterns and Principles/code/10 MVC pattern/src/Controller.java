public class Controller {

    public Student model;
    public Studentview stuview;

    public Controller(Student student,Studentview stuview){
        this.model =student;
        this.stuview=stuview;
    }

    public String getName(){
        return model.getName();
    }
    public int getId(){
        return model.getId();
    }
    public String getGrade(){
        return model.getGrade();
    }

    public void Setname(String name){
        model.Setname(name);
    }
    public void Setid(int id){
        model.Setid(id);
    }
    public void Setgrade(String grade){
        model.Setgrade(grade);
    }
    public void displaydetails(){
        stuview.displaydetails(model.getName(), model.getId(), model.getGrade());
    }
}
