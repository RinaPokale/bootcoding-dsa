package arrayList;

import java.util.ArrayList;
import java.util.List;

//119. Pascal's Triangle II
public class PascalTriangleTwo {
    public static List<Integer> getRow(int rowIndex) { //TC:- O(rowIndex)
        List<Integer> list = new ArrayList<>();
        rowIndex = rowIndex+1;
        long ans = 1;
        list.add((int) ans);

        for(int col = 1; col < rowIndex; col++){
            ans *= (rowIndex-col);
            ans /= col;
            list.add((int) ans);
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(getRow(30));
    }
}
