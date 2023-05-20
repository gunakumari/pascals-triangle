public class Iteration {
    public static void printPascalTriangle(int numRows) {
        int[][] triangle = new int[numRows][];
        
        for (int i = 0; i < numRows; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1; // First element in each row is 1
            
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j]; // Calculate current element based on previous row
            }
            
            triangle[i][i] = 1; // Last element in each row is 1
        }
        
        // Print Pascal's triangle
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numRows = 5;
        printPascalTriangle(numRows);
    }
}
