import java.util.Scanner;

public class firstString {
    public static void reverse(String Word[]) {
        int i = 0;
        int j = Word.length - 1;
        while (i < j) {
            String temp = Word[i];
            Word[i] = Word[j];
            Word[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] arg) {
        Scanner Sc = new Scanner(System.in);

        // *********************************************************

        // fint the target string
        // input : abc abc abc
        // target : b
        // output : 1,5,9

        // System.out.println("enter the String");
        // String s = Sc.nextLine();
        // System.out.println("enter the target String");
        // char target = Sc.next().charAt(0);

        // for (int i = 0; i < s.length(); i++) {
        // if (s.charAt(i) == target) {
        // System.out.print(i + " ");
        // }
        // }

        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        // find the maximum character
        // input : abc abcs addaaa
        // output : a

        // System.out.println("enter the string");
        // String a = Sc.nextLine();
        // int l = a.length();
        // int maxfreq = 0;
        // char answer = ' ';

        // for (int i = 0; i < l; i++) {
        // char fixedChar = a.charAt(i);
        // int currentfreq = 0;
        // for (int j = 0; j < l; j++) {
        // if (a.charAt(i) == fixedChar) {
        // currentfreq++;
        // }
        // }
        // if (currentfreq > maxfreq) {
        // maxfreq = currentfreq;
        // answer = fixedChar;
        // }
        // }
        // System.out.println(answer);

        // +++++++++++++++++++++++++++++++++++++++++++++++++++++
        // reverse the words
        // input : abc def ghi
        // output : ghi def abc

        System.out.println("enter the sting");
        String s = Sc.nextLine();
        int l = s.length();
        String currentWorld = " ";

        int count = 0;
        for (int i = 0; i < l; i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        count = count + 1;
        String Word[] = new String[count];
        int index = 0;

        for (int i = 0; i < l; i++) {
            if (s.charAt(i) != ' ') {
                currentWorld = currentWorld + s.charAt(i);
            } else {
                Word[index] = currentWorld;
                currentWorld = "";
                index++;
            }
        }

        Word[index] = currentWorld;
        reverse(Word);

        for (int i = 0; i < l; i++) {
            System.out.print(Word[i] + " ");
        }
    }
}
