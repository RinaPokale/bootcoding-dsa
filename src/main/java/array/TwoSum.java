package array;

public class TwoSum {

    public static int[] twoSum(int[] num, int target){
        int i = 0, len = num.length;
        int[] sum = new int[2];

        for(int j = i+1; j < len; j++){
            if(num[i] + num[j] == target){
                sum[0] = i;
                sum[1] = j;
                return sum;
            }
            else{
                if(j == len-1 && i < len-2){
                    i++;
                    j = i;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] num = {3, 2, 4};
        int target = 6;
        int[] sum = twoSum(num, target);

        for(int n: sum){
            System.out.println(n);
        }
    }
}
