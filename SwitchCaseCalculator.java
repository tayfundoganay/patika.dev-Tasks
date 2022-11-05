import java.util.Scanner;

public class SwitchCaseCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2, select;
        System.out.print("Enter First Number: ");
        number1 = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        number2 = scanner.nextInt();

        System.out.println("Select Operator");
        System.out.println("1- +\n2- -\n3- *\n4- /");

        select = scanner.nextInt();

        switch(select){
            case 1:
                System.out.println("Result is = " +(number1+number2));
                break;
            case 2:
                System.out.println("Result is = " + (number1-number2));
                break;
            case 3:
                System.out.println("Result is = " + (number1*number2));
                break;
            case 4:
                if(number2 == 0) {
                    System.out.println("No number is divisible by 0");
                }else {
                    System.out.println("Result is = " + (number1 / number2));
                }
    }
}
}
