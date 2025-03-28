import java.util.Scanner;;

public class Evenorddchecker {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = x.nextInt();
        if(num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
