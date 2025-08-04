public class Student {
   public String name;
   public int id;
   public String grade;

   public Student(String name, int id, String grade){
       this.name=name;
       this.id=id;
       this.grade=grade;
   }

   public String getName(){
       return name;
   }
   public int getId(){
       return id;
   }
   public String getGrade(){
       return grade;
   }

   public void Setname(String name){
       this.name=name;
   }
   public void Setid(int id){
       this.id=id;
   }
   public void Setgrade(String grade){
       this.grade=grade;
   }
}
