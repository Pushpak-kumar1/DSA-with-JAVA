package Recursion.PW;

public class sum_of_series {
    public static int seriesSum(int num) {
        //base case
        if(num == 0) return 0;

        if(num % 2 == 0) {
            return seriesSum(num-1) - num;
        } else {
           return seriesSum(num-1) + num;
        }
    }
    public static void main(String args[]) {
        int num = 4;

        System.out.println(seriesSum(num));
    }
}
