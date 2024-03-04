import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
    
    System.out.println("What is your weight");
    
    String scannerWeight = scanner.nextLine();
    
    System.out.println("What is your height");
    
    String scannerHeight = scanner.nextLine();
    
    float floatWeight = Float.parseFloat(scannerWeight);
    
    float floatHeight = Float.parseFloat(scannerHeight);

    }
}
