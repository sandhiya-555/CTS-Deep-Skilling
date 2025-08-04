public class ProxyImage implements Image{

    public String image;
    public RealImage real;

    public ProxyImage(String image){
        this.image=image;
    }

    @Override
    public void display() {
        if(real==null){
            this.real=new RealImage(image);
        }
        real.display();
    }
}
