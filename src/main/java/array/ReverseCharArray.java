package array;

public class ReverseCharArray {

    public static char[] reverseArray(char[] s){
        for(int i = 0; i < s.length / 2; i++){
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length-i - 1] = temp;
        }
        return s;
    }
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};

        char[] reverseArray = reverseArray(s);

        for(int i = 0; i < reverseArray.length; i++){
            System.out.println(reverseArray[i]);
        }
    }

}
