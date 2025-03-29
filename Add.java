import java.util.Scanner;;

public class Add {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter an integer between 0 and 1000 : ");
        int num = x.nextInt(),sum=0;

        if(num < 0 || num > 1000) {
            System.out.println("wrong! Enter between 0 and 1000");
        } else {
            int a = num;
            while (a > 0) {
                sum += a % 10;
                a /= 10;
            }
            System.out.println("Sum " + sum);
            }
        }

    }