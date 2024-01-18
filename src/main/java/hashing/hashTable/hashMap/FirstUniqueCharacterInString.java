package hashing.hashTable.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//387. First Unique Character in a String

public class FirstUniqueCharacterInString {
    public static int firstUniqueChar(String s) {
//        To avoid ConcurrentModificationException exception using ConcurrentHashMap
        Map<String, Integer> map = new ConcurrentHashMap<>();

        for(int i = 0; i < s.length(); i++){
            String ch = String.valueOf(s.charAt(i));
            if(!map.containsKey(ch)){
                map.put(ch, 1);
                continue;
            }
            map.put(ch, map.get(ch)+1);
        }

        int min = Integer.MAX_VALUE;
        int copy = min;
        for(String ch: map.keySet()){
            if(map.get(ch) != 1){ //remove duplicates
                map.remove(ch);
                continue;
            }
            map.put(ch, s.indexOf(ch)); // ele which is unique --> place index of it as val
            min = Math.min(map.get(ch), min);
        }

//        int min = Integer.MAX_VALUE;
//        int copy = min;
//        for(String ch: map.keySet()){
//            min = Math.min(map.get(ch), min);
//        }

        if(min != copy) // positive
            return min;
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueChar("leetcode"));
        System.out.println(firstUniqueChar("loveleetcode"));
        System.out.println(firstUniqueChar("aabb"));

    }
}
