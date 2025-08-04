public class excelfactory extends Documentfactory{
    @Override
    public Document createDocument() {
        return new exceldoc();
    }
}
