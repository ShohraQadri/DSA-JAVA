import java.util.Scanner;

public class string0 {
    public static void main(String[] arg) {

        // h e l l o
        // h e l l
        // h e l
        // h e
        // h

        // System.out.println("enter the word");
        Scanner Sc = new Scanner(System.in);

        // String s = Sc.nextLine();
        // for (int i = s.length(); i > 0; i--) {
        // for (int j = 0; j < i; j++) {
        // System.out.print(s.charAt(j) + " ");
        // }
        // System.out.println();
        // }

        // +++++++++++++++++++++++++++++++++++++++++++++++++++++
        // string palindrome or not

        // String s = Sc.nextLine();
        // int i = 0;
        // int j = s.length() - 1;
        // boolean palindrome = true;
        // while (i < j) {
        // if (s.charAt(i) != s.charAt(j)) {
        // palindrome = false;
        // break;
        // }
        // i++;
        // j--;
        // }
        // if (palindrome == true) {
        // System.out.println("this is palindrome : " + s);
        // } else {
        // System.out.println("this not a palindrome : " + s);
        // }

        // +++++++++++++++++++++++++++++++++++++++++++++++++++
        // String is palindrome or not

        // String s = Sc.nextLine();
        // StringBuilder S = new StringBuilder(s);

        // int i = 0;
        // int j = S.length() - 1;

        // while (i < j) {
        // char temp = S.charAt(i);
        // S.setCharAt(i, S.charAt(j));
        // S.setCharAt(j, temp);
        // i++;
        // j--;
        // }
        // System.out.println(S);

        // +++++++++++++++++++++++++++++++++++++++
        // normal question get length , copy and equal

        // String s = Sc.nextLine();
        // int length = s.length();
        // System.out.println(length);
        // String h = "Qadri";
        // System.out.print(s.concat(h));

        // ++++++++++++++++++++++++++++++++++++++++++++++++

        // System.out.println("enter the first String");
        // String string1 = Sc.nextLine();
        // System.out.println("enter the second String");
        // String string2 = Sc.nextLine();

        // if (string1.equals(string2)) {
        // System.out.println("string is equal.");
        // } else {
        // System.out.println("string is not equal");
        // }

        // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // how m,ay alphabet digit and character

        // System.out.println("enter the string");
        // String str = Sc.nextLine();
        // int alphabhet = 0, digit = 0, special = 0;
        // for (int i = 0; i < str.length() - 1; i++) {
        // char ch = str.charAt(i);
        // if (Character.isLetter(ch)) {
        // alphabhet++;
        // } else if (Character.isDigit(ch)) {
        // digit++;
        // } else {
        // special++;
        // }

        // }
        // System.out.println("total alphabet : " + alphabhet);
        // System.out.println("total digit is : " + digit);
        // System.out.println("total special character is : " + special);

        // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // Write a program to count total number of vowels and consonants in a string.

        System.out.println("enter the string");
        String str = Sc.nextLine().toLowerCase();
        int vowel = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("total voiwel " + vowel);
        System.out.println("total constant " + consonants);
    }
}
