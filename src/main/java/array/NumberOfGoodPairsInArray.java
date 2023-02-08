package array;

//1512. Number of Good Pairs
public class NumberOfGoodPairsInArray {
    public static int returnCountOfNumberOfGoodPairs(int[] num){
        int i = 0, count = 0, len = num.length;

        for(int j = 1; j < len; j++){
            if(i < j && num[i] == num[j])
                count++;

            if(j == len-1 && i < len-2) {
                i++;
                j = i;
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        int[] num = {1, 2, 3, 1, 1, 3};
//        int[] num = {1, 1, 1, 1};
        int[] num = {1, 2, 3};
        System.out.println(returnCountOfNumberOfGoodPairs(num));
    }
}
