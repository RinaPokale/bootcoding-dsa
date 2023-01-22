package recursion;

public class FindMaxEleUsingRecursion {
    public static void main(String[] args) {
        int num[] = {10, 20, 50, 1, 2};
        int max = num[0];
        int i = 0;
        System.out.println(returnMaxEle(num, max, i));
    }

    private static int returnMaxEle(int[] num, int max, int i){
        if(i == num.length-1)
            return max;

        if(num[num.length-(i+1)] > max)
            max = num[num.length-(i+1)];

        return returnMaxEle(num, max, i+1);
    }
}
