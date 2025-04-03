import java.util.Scanner;;

public class spychecker {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int num,sum=0,pro=1;
        System.out.print("Enter a number : ");
        num = x.nextInt();        
        int a = num;
        while (a > 0) {
            sum += a % 10;
            pro *= a % 10;
            a /= 10;
        }

        if (sum == pro) {
            System.out.println("spy");
        } else {
           System.out.println("Not spy");
        }
    }
}
