import java.util.Scanner;

public class gradePassCondition {
    public static void main(String[] args) {
        int math, physics,turkish, chemistry, music;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Math Grade: ");
        math = scanner.nextInt();
        if (math <=0 || math >= 100){math = 0;}
        System.out.print("Physics Grade: ");
        physics = scanner.nextInt();
        if (physics <=0 || physics >= 100){physics = 0;}
        System.out.print("Turkish Grade: ");
        turkish = scanner.nextInt();
        if (turkish <=0 || turkish >= 100){turkish = 0;}
        System.out.print("Chemistry Grade: ");
        chemistry = scanner.nextInt();
        if (chemistry <=0 || chemistry >= 100){chemistry = 0;}
        System.out.print("Music Grade: ");
        music = scanner.nextInt();
        if (music <=0 || music >= 100){music = 0;}

        double average = (math + physics + turkish + chemistry + music) / 5;

        if (average <= 55){
            System.out.println("You couldn't pass the grade !");
        }else {
            System.out.println("Congratulations, You pass the grade !");
        }
        System.out.println("Your Average is " + average);
    }



}
