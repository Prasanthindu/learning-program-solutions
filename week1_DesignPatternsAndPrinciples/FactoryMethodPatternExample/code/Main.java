package FactoryMethodPatternExample;
public class Main {
    public static void main(String[] args) {
        Document word = DocumentFactory.getDocument("WORD");
        word.open();

        Document pdf = DocumentFactory.getDocument("PDF");
        pdf.open();

        Document excel = DocumentFactory.getDocument("EXCEL");
        excel.open();
    }
}

