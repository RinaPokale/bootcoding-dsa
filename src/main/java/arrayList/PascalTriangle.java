package arrayList;

import java.util.ArrayList;
import java.util.List;

//118. Pascal's Triangle
public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) { //TC:- O(n^2)
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 1; i <= numRows; i++){
            list.add(generateRow(i));
        }
        return list;
    }

    public static List<Integer> generateRow(int row){
        List<Integer> list = new ArrayList<>();
        long ans = 1;
        list.add((int) ans);

        for(int col = 1; col < row; col++){
            ans *=(row-col);
            ans/= col;
            list.add((int) ans);
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

}
