package twoDArray;

public class FindMinEleIn2DArray {
    public static void main(String[] args) {
        int[][] matrix = {{10, 2, 3, 4}, {12, 13, 1, 5}};
        System.out.println("Min Element is " + minEleIn2D(matrix));
    }

    private static int minEleIn2D(int[][] matrix){
        int n = matrix.length; // row
        int m = matrix[0].length; // col
        int min = matrix[0][0];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] < min)
                    min = matrix[i][j];
            }
        }

        return min;
    }
}
