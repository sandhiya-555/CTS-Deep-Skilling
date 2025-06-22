package FactoryMethod;

// File: PdfDocument.java
public class PDF implements Document {
    public void open() {
        System.out.println("Opening PDF Document");
    }
}
