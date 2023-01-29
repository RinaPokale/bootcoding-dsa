package array;

public class KthMissingPositiveNum {
    public static int returnKthMissingPositiveNumber(int[] num, int k){
        int indx = 0;

        for(int i = 1;; i++){
            if(indx < num.length && i == num[indx]) {
                indx++;
                continue;
            }
            k--;
            if(k == 0)
                return i;
        }
    }

    public static void main(String[] args) {
//        int[] num = {2,3,4,7,11}; // k = 5
        int[] num = {1,2,3,4};
        int k = 2; // position -- > indx-1
        System.out.println(returnKthMissingPositiveNumber(num, k));
    }
}



/*
 if(i != num[indx]) {
                //if(!store.containsKey(num[i]))
                store.put(i, count++);
            }
            else {
                indx++;
            }
 */


/*
for(int i = 1; i <= 1000; i++){
            if(indx < num.length && i == num[indx]) {
                indx++;
            }
            else {
                store.put(i, count++);
            }
        }

 */