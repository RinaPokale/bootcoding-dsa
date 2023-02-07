package twoDArray;

//1572. Matrix Diagonal Sum

/* Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal
that are not part of the primary diagonal. */
public class DiagonalSum {
    public static int diagonalSum(int[][] matrix){
        int sum = 0, n = matrix.length;
        for(int i = 0; i < n; i++){ // O(n)
            sum+= matrix[i][i]; // primary diagonal sum
            if(i!=n-i-1)
                sum+= matrix[i][n-i-1]; // secondary diagonal sum
        }
        return sum; // primary diagonal + secondary diagonal
    }

    public static void main(String[] args) {
//      int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8} , {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println("Diagonal sum is " +diagonalSum(matrix));
    }
}
