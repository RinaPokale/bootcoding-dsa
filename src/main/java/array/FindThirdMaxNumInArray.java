package array;

//414. Third Maximum Number
public class FindThirdMaxNumInArray {

    public static int returnThirdMaxNum(int[] num){
        Integer fstmax = num[0]; // firstMax
        Integer sndMax = null; // secondMAx
        Integer trdMax = null; // thirdMAx

        for(Integer n : num){
            if(n.equals(fstmax) || n.equals(sndMax) || n.equals(trdMax)) {
                continue;
            }
            if(n > fstmax) {
                trdMax = sndMax;
                sndMax = fstmax;
                fstmax = n;
            } else if (sndMax == null || n > sndMax) {
                trdMax = sndMax;
                sndMax = n;
            } else if (trdMax == null || n > trdMax) {
                trdMax = n;
            }
        }
        if(trdMax!= null)
            return trdMax;

        return fstmax;
    }

    public static void main(String[] args) {
//        int[] num = {2};
        int[] num = {1, 2, -2234356};
//        int[] num = {2, 3};
//        int[] num = {1, 1, 2};
//        int[] num = {1, 1, 1};
//        int[] num = {5, 2, 2};
//        int[] num = {2, 2, 3, 1, 4};
//        int[] num = {7, 9, 2, 11, 8};
//        int[] num = {3, 2, 1};
//        int[] num = {10, 2, 100};
//        int[] num = {4, 5, 2, 9, 1};
//        int[] num = {5, 7, 6, 8, 4, 1};
//        int[] num = {5, 7, 6, 4, 2};
        System.out.println(returnThirdMaxNum(num));

    }
}





/*
int len = num.length;
        int fstmax = num[0]; // firstMax
        int sndMax = 0; // secondMAx
        int trdMax = 0; // thirdMAx

        for(int i = 1; i < len; i++){
            if(num[i] == fstmax || num[i] == sndMax || num[i] == trdMax) {
                continue;
            }
            if(num[i] > fstmax) {
                trdMax = sndMax;
                sndMax = fstmax;
                fstmax = num[i];
            } else if (num[i] > sndMax) {
                trdMax = sndMax;
                sndMax = num[i];
            } else if (num[i] > trdMax) {
                trdMax = num[i];
            }
        }
        if(trdMax!=0)
            return trdMax;

        return fstmax;
 */