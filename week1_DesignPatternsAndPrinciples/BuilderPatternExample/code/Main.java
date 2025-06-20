package BuilderPatternExample;

public class Main {
    public static void main(String[] args) {
       
        Computer computer1 = new Computer.Builder("Intel i7", 16)
                .setStorage(512)
                .setGraphicsCard(true)
                .build();

        Computer computer2 = new Computer.Builder("AMD Ryzen 5", 8)
                .build();

        System.out.println("Computer 1 specs:");
        computer1.showSpecs();

        System.out.println("\nComputer 2 specs:");
        computer2.showSpecs();
    }
}
