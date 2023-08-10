package array;

public class SumOfSeries {
    private static double sumOfSeries(int n){
        double sum = 0;
        for(int i = 1; i <= n; i++){
            sum += 1/(double)i;
        }
        return sum;
    }

    public static void main(String[] args) {
//        sumOfSeries(5);
        System.out.println(sumOfSeries(5));
    }
}
