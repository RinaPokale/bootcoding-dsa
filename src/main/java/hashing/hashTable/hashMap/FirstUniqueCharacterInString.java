package hashing.hashTable.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//387. First Unique Character in a String

//similar problem --> 451. Sort Characters By Frequency

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


    public static int firstUniqueCharTwo(String s){
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            String ch = String.valueOf(s.charAt(i));
            if(!map.containsKey(ch)){
                map.put(ch, 1);
                continue;
            }
            map.put(ch, map.get(ch)+1);
        }

        //unique ele
        for(int i = 0; i < s.length(); i++){
            if (map.get(String.valueOf(s.charAt(i))) == 1)
                return i;
        }
        return -1;
    }


    public static int firstUniqueCharThree(String s){
        int[] chars = new int[26];
        for(int i=0; i<s.length(); i++){
            chars[s.charAt(i)-'a']++;
        }

        for(int i=0;i<s.length();i++){
            if(chars[s.charAt(i)-'a'] == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueChar("leetcode"));
        System.out.println(firstUniqueChar("loveleetcode"));
        System.out.println(firstUniqueChar("aabb"));

        System.out.println(firstUniqueCharTwo("leetcode"));
        System.out.println(firstUniqueCharTwo("loveleetcode"));
        System.out.println(firstUniqueCharTwo("aabb"));

        System.out.println(firstUniqueCharThree("leetcode"));
        System.out.println(firstUniqueCharThree("loveleetcode"));
        System.out.println(firstUniqueCharThree("aabb"));



    }
}
