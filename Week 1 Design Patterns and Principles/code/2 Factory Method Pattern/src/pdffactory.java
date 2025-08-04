public class pdffactory extends Documentfactory{
    @Override
    public Document createDocument() {
        return new pdfdoc();
    }
}
