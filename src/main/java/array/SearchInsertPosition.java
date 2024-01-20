package array;

//35. Search Insert Position

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] num = {1, 3, 7, 9, 34, 45, 55, 67 , 78 , 90};
//        int[] num = {1, 3, 5, 6};
//        int target = 7;
//        int[] num = {3};
        int target = 50;
        System.out.println(searchInsert(num, target));
    }

    public static int searchInsert(int[] num, int target) {
        int l = 0;
        int h = num.length - 1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (target == num[mid])
                return mid;

            if (l == h)
                if (target > num[mid])
                    return l + 1;
                else
                    return l;

            if (target > num[mid])
                l = mid + 1;
            else
                h = mid - 1;

        }
        return l;
    }
}