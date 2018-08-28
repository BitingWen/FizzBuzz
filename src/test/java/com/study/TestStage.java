package com.study;


import org.junit.Test;

public class TestStage {

    /** stage1 */
    @Test
    public void stage01(){
        for (int i = 1; i <=100 ; i++) {
            if (i % (3*5) == 0 ){
                //for numbers which are multiples of both three and five
                System.out.println("FizzBuzz");
            }else if (i % 3 == 0){
                //for numbers which are multiples of three
                System.out.println("Fizz");
            }else if (i % 5 == 0){
                //for numbers which are multiples of five
                System.out.println("Buzz");
            }else {
                //for other numbers
                System.out.println(i);
            }
        }
    }

    /** stage2*/
    @Test
    public void stage02(){
        for (int i = 1; i <=100 ; i++) {
            int singleDigits = i % 10; //the single digit of a number
            int tensDigit = i / 10; //the tens digit of a number
            if ((tensDigit == 3 || singleDigits == 3 || i % 3 == 0) && (tensDigit == 5 || singleDigits == 5 || i % 5 == 0)){
                //a number is FizzBuzz if it is divisible by 3 or 5 and if it has a 3 or 5 in it
                System.out.println("FizzBuzz");
            }else if (tensDigit == 3 || singleDigits == 3 || i % 3 == 0){
                //a number is FizzBuzz if it is divisible by 3 or if it has a 3 in it
                System.out.println("Fizz");
            }else if (tensDigit == 5 || singleDigits == 5 || i % 5 == 0){
                //a number is FizzBuzz if it is divisible by 5 or if it has a 5 in it
                System.out.println("Buzz");
            }else {
                //others
                System.out.println(i);
            }

        }
    }





}
