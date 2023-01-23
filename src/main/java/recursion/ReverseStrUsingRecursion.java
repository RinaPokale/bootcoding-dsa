package recursion;

//WAP to reverse a string using recursion

public class ReverseStrUsingRecursion {
    public static void main(String[] args) {
        String str = "Hello world";
        char[] arr = str.toCharArray();
        reverseStr(arr, 0);

        System.out.print("Reversed string is ---> ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }

    private static void reverseStr(char[] arr, int i){
        if(i == arr.length/2)
            return;

        char temp = arr[i];
        arr[i] = arr[arr.length-(i+1)];
        arr[arr.length-(i+1)] = temp;

        reverseStr(arr, i+1);

    }
}
