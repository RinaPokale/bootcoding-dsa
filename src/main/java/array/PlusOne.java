package array;

//66. Plus One

/* You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit
of the integer. The digits are ordered from most significant to the least significant in left-to-right order.
The large integer does not contain any leading 0's. */

//Increment the large integer by one and return the resulting array of digits.

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
//       int digits[]  = {9, 9, 9};
       int[] digits = {3, 8, 9};
       int[] sum = plusOne(digits);

       for(int i = 0; i < sum.length; i++){
           System.out.print(sum[i] + " ");
       }
    }
}
