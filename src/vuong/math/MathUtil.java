/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuong.math;

import vuong.utils.MathUtility;

/**
 *
 * @author vuong
 */
public class MathUtil {
    public static void main (String[] args){
        long expected=120;
        long actual = MathUtility.getFactorial(5);
        System.out.println("5!: "+expected + "; Actual: "+ +actual);
        System.out.println("6!: "+MathUtility.getFactorial(6));
        System.out.println("0!: "+MathUtility.getFactorial(0));
        System.out.println("-5!: "+MathUtility.getFactorial(-5));
    }
}
