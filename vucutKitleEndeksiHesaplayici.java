import java.util.Scanner;

public class vucutKitleEndeksiHesaplayici {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        double height, bodyMassIndex;
        int weight;
        System.out.println("Enter your Height and Weight.");    
        height = scanner.nextDouble();  //Value Assignment
        weight = scanner.nextInt(); //Value Assignment
        bodyMassIndex = (weight / (height * height));   //Body Mass Index Calculation Result
        System.out.println("Body Mass Index = " + bodyMassIndex);
    }
}
