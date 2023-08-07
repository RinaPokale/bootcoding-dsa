package array;

//238. Product of Array Except Self

public class ProductOfArrExceptSelf {

//    Brute force approach --> O(n^2)
    public static int[] productOfArrExceptSelfOne(int[] num){
        int n = num.length;
        int[] ans = new int[n];
        int pro;

        for(int i = 0; i < n; i++){
            pro = 1;
            for(int j = 0; j < n; j++){
                if(i != j){
                    pro *= num[j];
                }
            }
            ans[i] = pro;
        }

        return ans;
    }

// this approach is suitable for those array which doesn't contain 0 in it
// and on top of that in this problem they've already mentioned that we cannot use division operator, so not gonna use this approach
    public static int[] productOfArrExceptSelfTwo(int[] num){ // O(n)
        int n = num.length;
        int ans[] = new int[n];
        int pro = 1;

        for(int i = 0; i < n; i++){
            pro*=num[i];
        }

        for(int i = 0; i < n; i++){
            ans[i] = pro/num[i];
        }
        return ans;
    }

    public static int[] productOfArrExceptSelfThree(int[] num){
        int n = num.length;
        int ans[] = new int[n];
        int temp = 1; // going to act like prefix and postfix according to situation

        //prefix
        for(int i = 0; i < n; i++){
            ans[i] = temp;
            temp *= num[i];
        }

        temp = 1; //postfix
        for(int i = n-1; i >= 0; i--){
            ans[i] *= temp;
            temp *= num[i];
        }
        return ans;
    }
    public static void main(String[] args) {
//        int[] num = {1, 2, 3, 4};
        int[] num = {-1,1,0,-3,3};
        int[] ans = productOfArrExceptSelfThree(num);
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
