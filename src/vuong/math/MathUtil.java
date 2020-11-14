/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuong.math;

import static vuong.utils.MathUtility.*;

/**
 *
 * @author vuong
 */
public class MathUtil {
    public static void main (String[] args){
        long expected=120;
        long actual =getFactorial(5);
        System.out.println("5!: "+expected + "; Actual: "+ +actual);
        System.out.println("6!: "+getFactorial(6));
        System.out.println("0!: "+getFactorial(0));
        System.out.println("-5!: "+getFactorial(-5));
        System.out.println("PI: "+PI);
    }
}
