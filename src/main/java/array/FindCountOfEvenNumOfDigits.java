package array;

public class FindCountOfEvenNumOfDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
//        int[] nums = {555,901,482,1771};
        System.out.println(findCountOfEvenNumOfDigits(nums));
    }
    private static int findCountOfEvenNumOfDigits(int[] nums){
       int flag = 0;

       for(int i = 0; i < nums.length; i++){
           if(count(nums[i]) % 2 == 0)
               flag++;
       }
       return flag;
    }
    private static int count(int n){
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
}


/*
int i = 0, count = 0, flag = 0;
       while (nums[i] != 0){
           nums[i] = nums[i]/10;
           count++;
           if(nums[i] == 0) {
               if(count % 2 == 0) { // even
                   flag++;
               }
               count = 0;
               i++;
               if(i == nums.length)
                   break;
           }
       }
 */