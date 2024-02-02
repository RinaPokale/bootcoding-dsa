package array;

public class TrappingRainWaterOptimized {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }


    // 2-Pointer Approach
    public static int trap(int[] height) { // TC:- O(n) & SC:- O(10
        int n = height.length;
        int l = 0, r = n-1;
        int leftMax = 0, rightMax = 0;
        int res = 0;

        while (l <= r){
            leftMax = Math.max(leftMax, height[l]); //find max height of building from left
            rightMax = Math.max(rightMax, height[r]); //find max height of building from right

            //if leftMax is less than rightMax which means my waterLevel is going to be decided by leftMax
            if(leftMax <= rightMax){
                res+= leftMax - height[l];
                l++;// after cal trapped water of current building shift left-pt toward right
            }
            //if rightMax is less than leftMax which means my waterLevel is going to be decided by rightMax
            else{
                res+= rightMax - height[r];
                r--; // after cal trapped water of current building shift right-pt toward left
            }
        }
        return res;
    }
}
