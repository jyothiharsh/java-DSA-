import java.util.Scanner;
class integer{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input");
        int num = scanner.nextInt();
        String str = scanner.nextLine();
        char str1 = scanner.next().charAt(0);
        System.out.println(num);
        System.out.println(str);
        System.out.println(str1);
    }
}