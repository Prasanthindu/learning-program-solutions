package ProxyPatternExample;

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("sample.jpg");

        System.out.println("Image object created");

       
        image.display();

        
        image.display();
    }
}
