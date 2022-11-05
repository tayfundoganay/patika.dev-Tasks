import java.util.Scanner;

public class userLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName, password;

        System.out.print("Username: ");
        userName = scanner.nextLine();

        System.out.print("Password: ");
        password = scanner.nextLine();

        if (userName.equals("Patika") && password.equals("java123")){
            System.out.println("You are logged in !");
        }else {
            System.out.println("Wrong Username or Password!");
        }

    }
