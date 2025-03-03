import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // normal prtint elemnt int arraylist

        // ArrayList<Integer> arr = new ArrayList<>();
        // arr.add(1);
        // arr.add(2);
        // arr.add(3);
        // for (int i = 0; i < arr.size(); i++) {
        // System.out.println(arr.get(i) + " ");
        // }

        // arraylist of arraylist

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>(); // []
        ArrayList<Integer> row = new ArrayList<>(); // [[]]

        row.add(1); // [1]
        row.add(2); // [1,2]
        row.add(3); // [1,2,3]

        arr.add(new ArrayList<>(row)); // [[1,2,3]]
        row.remove(2); // [1,2] --> remove
        arr.add(new ArrayList<>(row)); // arr = [[1,2,3],[1,2]]

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
}
