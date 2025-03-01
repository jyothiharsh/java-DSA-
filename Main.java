import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a marks:");
        int num = scan.nextInt();
        if ( num >= 90){
            System.out.println("grade A");
        }
        else if (num >= 80){
            System.out.println("grade B");
        }
        else if ( num >= 60){
            System.out.println("grade C");
        }
        else if ( num >= 35){
            System.out.println("grade D");
        }
        else{
            System.out.println("fail");
        }
    }
}
