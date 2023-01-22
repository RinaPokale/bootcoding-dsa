package recursion;

public class FindMinEleUsingRecursion {
    public static void main(String[] args) {
        int num[] = {10, 0, 1, 2};
        int min = num[0];
        int i = 0;
        System.out.println(findMinimum(num, min, i));
    }

    private static int findMinimum(int[] num, int min, int i){
        if(i == num.length-1)
            return min;

        if(num[num.length - (i+1)] < min)
            min = num[num.length - (i+1)];

        return findMinimum(num, min, i+1);

    }
}
