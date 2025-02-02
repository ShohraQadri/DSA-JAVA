import java.util.Scanner;

public class arrays {

    public static boolean istargetpresent(int target, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    // normal print the element in array
    public static void main(String[] arg) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter rthe size of array");
        int number = Sc.nextInt();

        int arr[] = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.println("enter the element int the array");
            arr[i] = Sc.nextInt();
        }

        // for (int i = 0; i <= number; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // *******************************************************************
        // find the target value is present in aaray or not.

        // System.out.println("enter the target value");
        // int target = Sc.nextInt();
        // int arr[] = new int[number];
        // for (int i = 0; i < number; i++) {
        // System.out.println("enter the element size");
        // arr[i] = Sc.nextInt();
        // }
        // if (istargetpresent(target, arr) == true) {
        // System.out.println("target value is present");
        // } else {
        // System.out.println("target value is not present");
        // }

        // ***********************************************************************
        // find the maximum and minimum number

        // int maximumnumber = arr[0];
        // int minimumnumber = arr[0];

        // for (int i = 1; i < number; i++) {
        // if (arr[i] > maximumnumber) {
        // maximumnumber = arr[i];
        // }
        // if (arr[i] < minimumnumber) {
        // minimumnumber = arr[i];
        // }
        // }
        // System.out.println("maximum number is: " + maximumnumber);
        // System.out.println("minimum number is : " + minimumnumber);

        // **************************************************************************

        // array is sorted or not

        // boolean isarraysorted = true;
        // for (int i = 0; i < number - 1; i++) {
        // if (arr[i] > arr[i + 1]) {
        // isarraysorted = false;
        // break;
        // }
        // }
        // if (isarraysorted == true) {
        // System.out.println("array is sorted");
        // } else {
        // System.out.println("array is not sorted");
        // }

        // ******************************************

        // insert the number in array;

        // System.out.println("enter the value you want to add ");
        // int value = Sc.nextInt();
        // System.out.println("enter the value position");
        // int position = Sc.nextInt();

        // int i = 0;
        // int j = 0;

        // int answer[] = new int[number + 1];
        // while (i < number + 1) {
        // if (i == position - 1) {
        // answer[i] = value;
        // } else {
        // answer[i] = arr[j];
        // j++;
        // }
        // i++;
        // }
        // i = 0;
        // while (i < number + 1) {
        // System.out.println(answer[i] + " ");
        // i++;
        // }

        // ********************************************************************

        // subarray of the array

        // for (int i = 0; i < number; i++) {
        // for (int j = i; j < number; j++) {
        // for (int k = i; k <= j; k++) {
        // System.out.print(arr[k] + " ");
        // }
        // System.out.println();
        // }
        // }

        // *************************************************************

        // print the even or odd element in the array

        // int evennumber = 0;
        // int oddnumber = 0;
        // for (int i = 0; i < number; i++) {
        // if (arr[i] % 2 == 0) {
        // evennumber++;
        // } else
        // oddnumber++;

        // }
        // if (evennumber > 0) {
        // for (int i = 0; i < number; i++) {
        // if (arr[i] % 2 == 0) {
        // System.out.print(arr[i] + " ");
        // }
        // }
        // System.out.println();
        // }
        // if (oddnumber > 0) {
        // for (int i = 1; i <= number; i++) {
        // if (arr[i] % 2 != 0) {
        // System.out.print(arr[i] + " ");
        // }

        // }
        // System.out.println();
        // }
        // System.out.println();

        // ***************************************************

        // duplicate number in array

        int maximumnumber = 0;
        for (int i = 1; i < number; i++) {
            maximumnumber = Math.max(maximumnumber, arr[i]);
        }
        int fre[] = new int[maximumnumber + 1];
        for (int i = 0; i < number; i++) {
            fre[arr[i]]++;
        }
        int count = 0;

        for (int i = 0; i < maximumnumber + 1; i++) {
            if (fre[i] >= 2) {
                count++;
            }
        }
        System.out.println("duplicate number " + count);
    }

}
