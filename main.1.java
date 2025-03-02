import java.util.Scanner;
class main1{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        System.out.println("enter a string");
        System.out.println("enter a character");
        int num = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();
        char str1 = scanner.next().charAt(0);
        System.out.println(num);
        System.out.println(str);
        System.out.println(str1);
    }
}