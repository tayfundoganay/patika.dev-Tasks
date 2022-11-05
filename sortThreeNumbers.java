package ConditionStatements;

import java.util.Scanner;

public class sortThreeNumbers {

    public static void main(String[] args) {

        int number1, number2, number3;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter number 1: ");
        number1 = scanner.nextInt();

        System.out.print("Please enter number 2: ");
        number2 = scanner.nextInt();

        System.out.print("Please enter number 3: ");
        number3 = scanner.nextInt();
        int temp;

        if (number1>number2){
            temp = number1;
            number1 = number2;
            number2 = temp;
        }else if (number1>number3){
            temp = number1;
            number1 = number3;
            number3 = temp;
        }else if (number2>number3){
            temp = number2;
            number2 = number3;
            number3 = temp;
        }

        System.out.printf("%d, %d, %d ", number1, number2, number3);

    }
}
