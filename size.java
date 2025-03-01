import java.util.Scanner;
class size{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size:");
        int num = scan.nextInt();
        switch(num) {
            case 29:
                System.out.println("small");
                break;
            case 30:
                System.out.println("medium");
                break;
            case 38:
                System.out.println("large");
                break;
            case 42:
                System.out.println("xlarge");
                break;
            default:
                System.out.println("invalid");
                break;
        }
    }
}