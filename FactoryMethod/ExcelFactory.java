package FactoryMethod;

// File: ExcelDocumentFactory.java
public class ExcelFactory extends DocumentFactory {
    public Document createDocument() {
        return new Excel();
    }
}

