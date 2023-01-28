package sorting;

public class BubbleSort {
    public static void bubbleSort(int[] num){
        for(int i = 0; i < num.length-1; i++){
            for(int j = 0; j < num.length-(i+1); j++){
                if(num[j] > num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
//        int[] num = {50, 17, 19, 13, 5};
        int[] num = {45, 32, 2, 17, 40, 10};

        bubbleSort(num);

        for(int n: num )
            System.out.println(n);
    }
}
