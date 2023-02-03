package twoDArray;

public class FindMaxEleIn2DArray {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 6, 4}};
        System.out.println("Max Element is " + maxEleIn2D(matrix));
    }

    private static int maxEleIn2D(int[][] matrix){
        int n = matrix.length; // row length
        int m = matrix[0].length; // col length
        int max = matrix[0][0];

        for(int i = 0; i < n; i++){ // row
            for(int j = 0; j < m; j++){ // col
                if(matrix[i][j] > max)
                    max = matrix[i][j];
            }
        }

        return max;
    }
}
