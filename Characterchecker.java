import java.util.Scanner;;

public class Characterchecker {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter a character : ");
        char letter = x.next().charAt(0);
        if (Character.isUpperCase(letter)) {
            System.out.println(letter + " is uppercase");
        } else if (Character.isLowerCase(letter)) {
            System.out.println(letter + " is lowercase");
        } else {
            System.out.println("neither");
        }
    }
}
