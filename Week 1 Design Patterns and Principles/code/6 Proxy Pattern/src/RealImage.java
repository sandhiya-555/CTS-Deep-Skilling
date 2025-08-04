import java.sql.SQLOutput;

public class RealImage implements Image{

    private String image;

    public RealImage(String image){
        this.image=image;
        loadimage(image);
    }

    public void loadimage(String image){
        System.out.println("Loading the image filename:"+image);
    }

    public void display(){
        System.out.println("Displaying the image:"+image);
    }
}
