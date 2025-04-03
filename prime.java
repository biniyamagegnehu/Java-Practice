import java.util.Scanner;;

public class prime {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int count =0;
        System.out.print("Enter a number : ");
        int num = x.nextInt();
        if (num>1) {
           for(int i=1; i<=num; i++){
            if (num % i == 0) {
                count++;
            }
           } 
           if (count == 2) {
            System.out.println(num + " is prime");
           } else {
            System.out.println(num + " is not a prime");
           }
        }
    }
}
