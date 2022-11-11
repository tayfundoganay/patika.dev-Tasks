import java.util.Scanner;

public class evenSum {
    public static void main(String[] args) {
        int number, total = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter a number : ");
            number = scanner.nextInt();
            if (number%2 == 1){
                total += number;
            }
        }while (number > 0);
        System.out.println("Girilen tek sayıların toplamı.");
    }
}
