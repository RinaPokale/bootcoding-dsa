package twoDArray;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[3][4];
        int n = matrix.length; // no. of rows
        int m = matrix[0].length; // no. of col

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Elements:- ");

        for(int i = 0; i < n; i++) { // row
            for (int j = 0; j < m; j++) {  // col
                matrix[i][j] = sc.nextInt(); // cell --> (i, j)
            }
        }

        //print
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
