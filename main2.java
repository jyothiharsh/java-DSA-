import java.util.Scanner;
class main2{
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        scan.close();

         for (int i=0; i < y; i++) {
             System.out.println(x);
         }


    }
}