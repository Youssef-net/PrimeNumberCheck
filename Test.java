/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package youssef.primenumber;

/**
 *
 * @author Youssef
 */
public class Test {

    private int[] nums_1 = {1, 2, 3, 4, 5,4};
    private boolean expected_1 = true;
    
    private int[] nums_2 = {1, 2, 3, 4, 5};
    private boolean expected_2 = false;
    
    private int[] nums_3 = {2, 2, 2, 4, 4};
    private boolean expected_3 = true;
    
    private int[] nums_4 = {2, 2};
    private boolean expected_4 = true;
    
    private int[] nums_5 = {3, 0, 3, 6, 3, 3};
    private boolean expected_5 = false;

    public void testCase_1() {
        this.testingStart(this.nums_1, expected_1);
    }

    public void testCase_2() {
        this.testingStart(this.nums_2, this.expected_2);
    }

    public void testCase_3() {
        this.testingStart(this.nums_3, this.expected_3);
    }

    public void testCase_4() {
        this.testingStart(this.nums_4, this.expected_4);
    }

    public void testCase_5() {
        this.testingStart(this.nums_5, this.expected_5);
    }

    public void testingStart(int[] nums, boolean expected) {

        Engine sol = new Engine();
        boolean output = sol.checkPrimeFrequency(nums);

        System.out.printf("Input nums: %s; Output: %b; expected: %b .%n", java.util.Arrays.toString(nums), output, expected);

    }

}
