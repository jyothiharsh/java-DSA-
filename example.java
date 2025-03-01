import java.util.Scanner;
class example{
    public static void main(String[]args){
        System.out.println("enter a value of x:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for(int i = x; i <= 1000; i += x)
        System.out.println(i);

    }
}