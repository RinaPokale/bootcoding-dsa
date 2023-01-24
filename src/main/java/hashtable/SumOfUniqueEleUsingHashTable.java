package hashtable;

import java.util.HashMap;

public class SumOfUniqueEleUsingHashTable {
    private static int sumOfUniqueEle(int[] a){
        HashMap <Integer, Integer> store = new HashMap <>();
        int sum = 0;

        for(int i = 0; i < a.length; i++) {
            if (store.containsKey(a[i])){
                int value = store.get(a[i]);
                store.put(a[i], value + 1);
            }
            else {
                store.put(a[i], 1);
            }
        }

        for(Integer key : store.keySet()){
            int value =  store.get(key);
            if(value == 1)
                sum+=key;
        }
        return sum;
    }


    public static void main(String[] args) {
        int a[] = {10, 20, 10, 30, 20, 40};
//        find duplicate elements in an array
        System.out.println(sumOfUniqueEle(a));
    }


}
