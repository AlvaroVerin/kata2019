/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cifpcarballeira.katas.FizzBuzz;

/**
 *
 * @author DAM108
 */
public class FizzBuzz {

    public String getFizzBuzz(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        }
        if (num % 5 == 0) {
            return "Buzz";
        }
        if (num%3 == 0 || Integer.toString(num).contains("3")){
            return "Fizz";
        }
        
        if (num % 3 == 0) {
            return "Fizz";
        } else {
            return Integer.toString(num);
        }

    }

}
