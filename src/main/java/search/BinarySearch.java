package search;

public class BinarySearch {
    public static void main(String[] args) {
//        int[] num = {2, 3, 4, 5, 6, 7};
        int[] num = {1,5};
        int target = 0;
        System.out.println( binarySearch(num, target, 0, num.length-1));
    }

    public static int binarySearch(int[] num, int target, int left, int right){
        int mid = (left+right)/2;

        if(target == num[mid])
            return mid;

        if(left >= right)
            return -1;

        if (target > num[mid]) {
            return binarySearch(num, target, mid+1, right);
        }
        else
            return binarySearch(num, target, left, mid-1);
    }
}
