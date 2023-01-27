package sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] num = {54, 2, 76, 8, 90, 1};
        selectionSort(num);
        for(int n: num)
            System.out.print(n + " ");
    }

    public static void selectionSort(int[] num){
        for(int i = 0; i < num.length-1; i++){
            int min = i;
            for(int j = i+1; j < num.length; j++){
                if(num[j] < num[min])
                    min = j;
            }

            //swapping
            if(min != i){
                int temp = num[min];
                num[min] = num[i];
                num[i] = temp;
            }

        }
    }
}
