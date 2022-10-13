/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.myprojects.expressions;

/**
 *
 * @author mpmit
 */
public class Expressions {
 
    public static void main(String[] args) {
       // Declare variables
         int number1;
         int number2;
         int number3;
  
         //initialize the variables
        number1 = 3;
        number2 = 7;
        
        // Calculate and display
        //Addition
        int result = number1+number2;
        
        System.out.println(result);
        
        number3 = number2;
        
        System.out.println("Number 2 value: " + number2 + "and Number 3 value is: " + number3);
        
        //Multiplication and addition
        result = result + number1*number3;
        System.out.println(result);
        
        //Modulo operand and checking is it odd or even number
        
        if(result%2 == 0){
        System.out.println("The result is an even number");
        }
        else {
         System.out.println("The result is an odd number");
        }
        
        
        
        
        
        
        
        
        
        
    }
}
