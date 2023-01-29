package array;

public class TransposeOfMatrix {
    public static void transposeOfMatrix(int[][] num){
        int row = num.length;
        int col = num[0].length;

        int[][] transpose = new int[col][row];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                transpose[j][i] = num[i][j];
            }
        }

    }

    public static void main(String[] args) {
//        int[][] num = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] num = {{1, 2, 3}, {4, 5, 6}};
        transposeOfMatrix(num);
    }
}
