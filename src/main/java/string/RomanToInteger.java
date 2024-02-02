package string;

import java.util.HashMap;
import java.util.Map;

//13. Roman to Integer
public class RomanToInteger {
    static Map<Character, Integer> map = new HashMap<>();

    public static int romanToInt(String s) { //TC & SC:- O(n)
        int sum = 0;
        int n = s.length();
        check();
        sum += map.get(s.charAt(n-1));

        for(int i = n-2; i >= 0; i--){

            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                sum -= map.get(s.charAt(i));
            }
            else {
                sum += map.get(s.charAt(i));
            }
        }
        return sum;
    }

    public static int romanToIntTwo(String s){ // TC:- O(n) & SC:- O(1)
        int val = 0, next = 0;
        int sum = 0;
        int n = s.length();

        for(int i = n-1; i >= 0; i--){
            switch (s.charAt(i)) {
                case 'I' -> val = 1;
                case 'V' -> val = 5;
                case 'X' -> val = 10;
                case 'L' -> val = 50;
                case 'C' -> val = 100;
                case 'D' -> val = 500;
                case 'M' -> val = 1000;
            }
            if (i == n-1){  //one-time
                sum += val;
                next = val;
                continue;
            }
            if(val < next){ //currentVal < nextVal
                sum -= val;
            }
            else {
                sum += val;
            }
            next = val;
        }
        return sum;

    }

    public static void check(){
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));

        System.out.println(romanToIntTwo("IV"));
        System.out.println(romanToIntTwo("III"));
        System.out.println(romanToIntTwo("LVIII"));
        System.out.println(romanToIntTwo("MCMXCIV"));

    }
}

/*
if(s.equals("I"))
            return 1;
        else if (s.equals("V"))
            return 5;
        else if (s.equals("X"))
            return 10;
        else if (s.equals("L"))
            return 50;
        else if (s.equals("C"))
            return 100;
        else if (s.equals("D"))
            return 500;
        else if (s.equals("M"))
            return 1000;

        return 0;
 */