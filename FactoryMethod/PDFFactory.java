package FactoryMethod;

// File: PdfDocumentFactory.java
public class PDFFactory extends DocumentFactory {
    public Document createDocument() {
        return new PDF();
    }
}
