import java.util.Scanner;;

public class Characterchecker {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter a character : ");
        char letter = x.next().charAt(0);

        if (letter >= 'A' && letter <= 'Z') {
            System.out.println(letter + " is uppercase");
        } else if (letter >= 'a' && letter <= 'z') {
            System.out.println(letter + " is lowercase");
        } else {
            System.out.println(letter + " is neither");
        }
        
}
}