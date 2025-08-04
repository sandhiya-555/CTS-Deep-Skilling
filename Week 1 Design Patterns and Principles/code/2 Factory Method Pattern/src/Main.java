public class Main {
    public static void main(String[] args) {

        Documentfactory factory= new excelfactory();
        Document excel= factory.createDocument();
        excel.open();
        Documentfactory factoey= new pdffactory();
        Document pdf=factoey.createDocument();
        pdf.open();
        Documentfactory factriy= new wordfactory();
        Document word=factriy.createDocument();
        word.open();
    }
}