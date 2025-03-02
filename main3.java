import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        System.out.println("enter firstname");
        System.out.println("enter lastname");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int n = scanner.nextInt();
        scanner.close();
        String fullName = firstName + lastName;

        for (int i = 0; i < n; i++) {
            System.out.println(fullName);
        }
    }
}
