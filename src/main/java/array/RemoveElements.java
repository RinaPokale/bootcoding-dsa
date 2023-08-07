package array;

//27. Remove Element
public class RemoveElements {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(val!=nums[i]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
//        int[] num = {0,1,2,2,3,0,4,2};
//        int val = 2;
        int[] num = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(num, val));
    }
}
