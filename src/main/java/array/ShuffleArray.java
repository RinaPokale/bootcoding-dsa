package array;

public class ShuffleArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] suffleNum = new int[nums.length];
        int evn = 0, od = 1, l = n;

        for(int i = 0; i < n; i++){
            suffleNum[evn] = nums[i];
            evn+=2;
            suffleNum[od] = nums[l++]; // (nums.length-n) + i
            od+=2;
        }
        return suffleNum;


    /*  int count = 0;
        for(int i = 0; i < n; i++){
            suffleNum[count] = nums[i];
            count+=2;
        }
        for(int i = 1; i < nums.length; i+=2){
            suffleNum[i] = nums[n++];
        }
    */

    /*    int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 1){
                suffleNum[i] = nums[n++];
            }else{
                suffleNum[i] = nums[count++];
            }
        }
    */

    }

    public static void main(String[] args) {
//        int[] num = {2,5,1,3,4,7};
        int[] num = {1,2,3,4,4,3,2,1};
        int[] shuffleNum = shuffle(num, 4);
    }
}
