import java.util.Scanner;

public class threeAndFourCalculator {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı giriniz:");
        number = scanner.nextInt();

        int sum = 0, counter = 0;
        for (int i = 1; i <= number; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                sum += i;
                counter++;
            }
        }System.out.println("Girilen sayıya kadar olan 3 ve 4 ö bölünebilen sayıların ortalaması = " + sum + "/" + counter+ " = " +(sum/counter));
    }}
