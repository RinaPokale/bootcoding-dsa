package recursion;

//WAP to reverse a string using recursion

public class ReverseStrUsingRecursion {
    public static void main(String[] args) {
        String str = "Hello";
        char[] arr = str.toCharArray();
        reverseStr(arr, 0);
    }

    private static void reverseStr(char[] arr, int i){
        if(i == arr.length)
            return;

        reverseStr(arr, i+1);
        System.out.println(arr[i]);
    }
}
