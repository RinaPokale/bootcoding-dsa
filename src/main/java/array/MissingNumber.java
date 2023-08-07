package array;

import java.util.Arrays;

//268. Missing Number
public class MissingNumber {
    public static int missingNumber(int[] num){
        Arrays.sort(num);
        int max = num[num.length-1], i;

        for(i = 0 ; i <= max; i++){
            if(num[i] != i)
                return i;
        }
        return i;
    }

    public static int missingNumberTwo(int[] num){
        int n = num.length, sum = n*(n+1)/2;

        for(int i : num)
            sum -= i;

        return sum;
    }

    public static void main(String[] args) {
//        int[] num = {0, 1};
        int[] num = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumberTwo(num));
    }
}
