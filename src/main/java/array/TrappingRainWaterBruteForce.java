package array;

public class TrappingRainWaterBruteForce {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trapBruteForceOne(height));
        System.out.println(trapBruteForceTwo(height));
    }

    //Brute Force One --> find leftMax & rightMax for each ith position
    public static int trapBruteForceOne(int[] height) { //TC:- O(n^2) & SC:- O(1)
        //for each i position
        //leftMax --> 0 to i
        //RightMax ---> i to n-1

        int res = 0;
        for(int i = 0; i < height.length; i++){
            //calculate maxLeft & maxRight for each ith position
            int maxLeft = 0;
            for(int j = i; j >= 0; j--){
                maxLeft = Math.max(maxLeft, height[j]);
            }

            int maxRight = 0;
            for(int j = i; j < height.length; j++){
                maxRight = Math.max(maxRight, height[j]);
            }

            res+= Math.min(maxLeft, maxRight) - height[i];
        }
        return res;
    }

    //Brute Force Two --> Using Auxiliary Array
    public static int trapBruteForceTwo(int[] height) {// TC & SC --> O(n)
        //Using Auxiliary Array
        //#prefix --> leftMax
        //#sufix ---> rightMAx

        int res = 0;
        int n = height.length;
        int[] leftMax = new int[n]; //prefixMax
        int[] rightMax = new int[n]; //suffixMax

        leftMax[0] = height[0];
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        rightMax[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        //waterLevel = min(rightMax[i], leftMax[i])
        //trappedRainWater = waterLevel - height[i] * 1;
        for (int i = 0; i < n; i++){
            res+= Math.min(rightMax[i], leftMax[i]) - height[i]; //trapped rainwater
        }
        return res;
    }

    // 2-Pointer Approach
    public static int trapOptimized(int[] height) { // TC:- O(n) & SC:- O(10
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
