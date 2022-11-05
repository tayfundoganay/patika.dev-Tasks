public class gradePassCondition {
    public static void main(String[] args) {
        int math, physics,turkish, chemistry, music;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Math Grade: ");
        math = scanner.nextInt();
        System.out.print("Physics Grade: ");
        physics = scanner.nextInt();
        System.out.print("Turkish Grade: ");
        turkish = scanner.nextInt();
        System.out.print("Chemistry Grade: ");
        chemistry = scanner.nextInt();
        System.out.print("Music Grade: ");
        music = scanner.nextInt();

        double average = (math + physics + turkish + chemistry + music) / 5;

        if (average <= 55){
            System.out.println("You couldn't pass the grade !");
        }else {
            System.out.println("Congratulations, You pass the grade !");
        }
        System.out.println("Your Average is " + average);
    }



}
