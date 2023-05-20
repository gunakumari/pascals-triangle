import java.util.HashMap;
import java.util.Map;

public class modularization {
    private static Map<String, Integer> memo = new HashMap<>();

    public static int getPascalValue(int row, int column) {
        String key = row + "_" + column;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        if (column == 0 || column == row) {
            memo.put(key, 1);
            return 1;
        }

        int pascalValue = getPascalValue(row - 1, column - 1) + getPascalValue(row - 1, column);
        memo.put(key, pascalValue);
        return pascalValue;
    }

    public static void printPascalTriangle(int numRows) {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(getPascalValue(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numRows = 5;
        printPascalTriangle(numRows);
    }
}
