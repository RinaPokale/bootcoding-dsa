package twoDArray;

//Matrix Diagonal Sum
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
//        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8} , {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(diagonalSum(matrix));
    }
}
