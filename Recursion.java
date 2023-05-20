public class Recursion {
    public static int getPascalValue(int row, int column) {
        if (column == 0 || column == row) {
            return 1;
        }
        
        int leftValue = getPascalValue(row - 1, column - 1);
        int rightValue = getPascalValue(row - 1, column);
        
        return leftValue + rightValue;
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
