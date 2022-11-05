import java.util.Scanner;

public class weatherConditionEventSuggestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int heat;
        System.out.println("Enter Heat!");
        heat = scanner.nextInt();
        
        if (heat < 5){
            System.out.println("You can go to skiing .");
        } else if (heat >= 5 && heat <=25) {
            if (heat <= 15){
                System.out.println("You can go to Cinema.");
            }else if (heat >= 10){
                System.out.println("You can go to picnic.");
            }
        }else {
            System.out.println("You can go to swimming.");
        }
    }
}
