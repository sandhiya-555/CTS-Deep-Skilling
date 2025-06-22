package FactoryMethod;

// File: ExcelDocument.java
public class Excel implements Document {
    public void open() {
        System.out.println("Opening Excel Document");
    }
}
