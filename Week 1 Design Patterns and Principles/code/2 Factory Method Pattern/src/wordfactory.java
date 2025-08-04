public class wordfactory extends Documentfactory{
    @Override
    public Document createDocument() {
        return new Worddoc();
    }
}
