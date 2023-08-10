package array;

import java.util.IdentityHashMap;
import java.util.Map;

//1394. Find Lucky Integer in an Array
public class FindLuckyNumber {
    public static void main(String[] args) {
//        int[] num = {2,2,3,4};
//        int[] num = {1,2,2,3,3,3};
        int[] num = {2,2,2,3,3};
        System.out.println(findLucky(num));
    }
    public static int findLucky(int[] arr) { // TC & SC :- O(n)
        Map<Integer, Integer> map = new IdentityHashMap<>();

        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
                continue;
            }
            map.put(arr[i], 1);
        }

//        for(Integer i: map.keySet()){
//            System.out.println(i + "->" + map.get(i));
//        }

        int max = -1;
        for(Integer i: map.keySet()){
            if(i == map.get(i)) {
                max = Math.max(max, i);
            }
        }
        return max;
    }
}
