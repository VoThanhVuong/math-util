/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuong.utils;

/**
 *
 * @author vuong
 */
public class MathUtility {

    public static final double PI = 3.1415;

//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("u must be between 0...20");
//        }
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        long result = 1;
//        for(int i=2; i<=n;i++){
//            result*=i;
//        }
//        return result;
//    }  
    public static long getFactorial(int n) {
        if(n<0||n>20) throw new IllegalArgumentException("n must be between 0...20");
        if(n==0||n==1) return 1;
        return n*getFactorial(n-1);
    }
}
