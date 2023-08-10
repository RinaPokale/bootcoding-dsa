package array;

//1089. Duplicate Zeros

import java.util.HashMap;

public class DuplicateZeros {
    //Brute force Approach --O(n^2)
    public static void duplicateZeros(int[] arr) {

         for (int i = 0; i < arr.length; i++){
             if(arr[i] == 0){
                 for(int j = arr.length-1; j >= i+1; j--){
                     arr[j] = arr[j-1];
                 }
                i+=1; // to ignore the 0 duplicate
             }
         }
        for(int k: arr){
            System.out.println(k);
        }
    }

    public static void duplicateZerosTwo(int[] arr) { //sc & Tc -->O(n)
        int n = arr.length;
        int[] num = new int[n]; // temp array
        int i = 0; // for arr i.e original
        int j = 0; //for num

        while (i < n && j < n){
            if(arr[i] == 0){
                num[j] = 0;
                if(j+1 < n){
                    num[j+1] = 0;
                }
                j+=2;
                i++;
            }
            else{
                num[j] = arr[i];
                i++;
                j++;
            }
        }

        for(int k = 0; k < n; k++){
            arr[k] = num[k];
        }

        for(int k: arr){
            System.out.println(k);
        }
    }

    public static void duplicateZerosOptimized(int[] arr){
        int st = 0, end = arr.length-1;

        if(arr.length == 1) // if size is 1
            return;

        while (st<end){
            if(arr[st] == 0)
                end--; // 0 exist and will find last element of output array
            st++;
        }

        if(end == arr.length-1) // 0 doesn't exist
            return;

        //if 0 exist
        for(int i = arr.length-1; i>=0 && end>=0; i--, end--){
            arr[i] = arr[end];
            if(end!=st && arr[end] == 0){
                arr[i-1] = 0;
                i=i-1;
            }
        }

        for(int k: arr){
            System.out.println(k);
        }
    }
    public static void main(String[] args) {
//        int[] num = {1, 0, 2, 3, 0, 4, 5, 0};
        int[] num = {8, 4, 5, 0, 0, 0, 0, 7};
        duplicateZerosOptimized(num);
    }
}
