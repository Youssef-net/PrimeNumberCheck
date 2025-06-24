/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package youssef.primenumber;

/**
 *
 * @author Youssef
 */
public class Main {

    public static void main(String[] args) {
        
        Test test = new Test();
        //Test già preparati
        
        //test.testCase_1();
        //test.testCase_2();
        //test.testCase_3();
        //test.testCase_4();
        //test.testCase_5();
        
        //Test in cui potete inserire voi la lista di numeri ed il risultato aspettato 
        
        int[] nums = {1,2,3,7,7,4,5,6,7,8,7,9,7,10,11,7,12,7,7};
        test.testingStart(nums, false);
    }
}
