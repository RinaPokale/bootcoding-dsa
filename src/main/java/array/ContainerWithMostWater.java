package array;

//11. Container With Most Water
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int maxWater = maxArea(height);
        System.out.println(maxWater);
    }
    public static int maxArea(int[] height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.length-1;

        while (lp < rp){
            //calculate waterArea
            int ht = Math.min(height[lp], height[rp]);
            int width = rp - lp;
            int currentWater = width * ht;
            maxWater = Math.max(currentWater, maxWater);

            //update pointers
            if(height[lp] < height[rp])
                lp++;
            else
                rp--;
        }
        return maxWater;
    }
}
