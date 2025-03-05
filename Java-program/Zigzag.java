import java.util.ArrayList;

public class Zigzag {
    public String convert(String s, int numRows) {
        // same row ko return krne ke lye agr rpw 1 hi h to
        if (numRows == 1) {
            return s;
        }

        // create array for element
        ArrayList<ArrayList<Character>> arr = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            ArrayList<Character> curentRow = new ArrayList<>();
            arr.add(new ArrayList<>());
        }

        int rowIndex = 0;
        int turn = 0;

        for (int i = 0; i < s.length(); i++) {
            arr.get(rowIndex).add(s.charAt(i));
            if (turn == 0) {
                rowIndex++;
                if (rowIndex == numRows) {
                    rowIndex = rowIndex - 2;
                    turn = 1;
                }
            } else {
                rowIndex--;
                if (rowIndex == -1) {
                    rowIndex = rowIndex + 2;
                    turn = 0;
                }
            }
        }

        StringBuilder answer = new StringBuilder("");
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                answer.append(arr.get(i).get(j));
            }
        }
        return answer.toString();
    }
}
