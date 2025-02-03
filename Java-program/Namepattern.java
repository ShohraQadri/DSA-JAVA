import java.util.*;

public class Namepattern {
    public static void main(String[] args) {

        // S
        // S H
        // S H O
        // S H O H
        // S H O H R
        // S H O H R A

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Name: ");
        String str = sc.nextLine();

        // Printing the pattern
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(str.charAt(j) + " ");
            }
            System.out.println();
        }
    }
}