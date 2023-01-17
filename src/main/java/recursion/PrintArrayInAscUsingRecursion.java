package recursion;

//WAP to print the array elements using recursion
public class PrintArrayInAscUsingRecursion {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        printArrayNum(num, 0);
    }

    private static void printArrayNum(int[] num, int i){
        if(i == num.length) // base condition
            return;

        System.out.println(num[i]);
        printArrayNum(num, ++i); // calling

    }
}
