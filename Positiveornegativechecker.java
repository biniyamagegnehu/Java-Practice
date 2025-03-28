import java.util.Scanner;;

public class Positiveornegativechecker {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = x.nextInt();
        if (num > 0) {
            System.out.println(num + " is Positive");
        } else if (num < 0) {
            System.out.println(num + " is negative");
        } else {
            System.out.println(num + " is zero");
        }
    }
}
