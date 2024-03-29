package array;

//1470. Shuffle the Array

/*Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].*/

public class ShuffleArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] shuffleNum = new int[nums.length];
        int evn = 0, od = 1, l = n;

        for(int i = 0; i < n; i++){
            shuffleNum[evn] = nums[i];
            evn+=2;
            shuffleNum[od] = nums[l++]; // (nums.length-n) + i
            od+=2;
        }
        return shuffleNum;


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
