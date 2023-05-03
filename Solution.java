public class Solution {
    public double myPow(double x, int n) {
        double result = 1;

        if (x == 0) return 0;
        if (x == 1) return 1;
        if (x == -1 && n%2 == 0) return 1;
        if (x == -1 && n%2 != -1) return -1;
        if (n == 0) return 1;
        if (n == 1) return x;

        if (n >= Math.pow(2,31)-1 || n<= Math.pow(-2,31)) return 0;


        if (n>1){
            for (int i = 0; i < n; i++) {
                result = result*x;
            }
        }
        else {
            n = n*-1;
            for (int i = 0; i < n; i++) {
                result = result/x;
            }
        }
        return result;
    }
}
