package recursion;

public class PrintArrayInDscUsingRecursion {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        printArrayNum(num, 0);
    }

    private static void printArrayNum(int[] num, int i){
        if(i == num.length) // base condition
            return;

        // calling
        printArrayNum(num, i+1);  // i++ and i+1 are different
        System.out.println(num[i]);//2

    }
}
