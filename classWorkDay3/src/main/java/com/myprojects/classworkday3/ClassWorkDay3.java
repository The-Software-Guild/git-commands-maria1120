/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.myprojects.classworkday3;
import java.util.Scanner;

/**
 *
 * @author Maria Miteva
 * @since 12/10/2022
 */
public class ClassWorkDay3 {

    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        float width;
        float height;
        float area;
        float perimeter;
        double glassCost = 3.50;
        double trimCost =  2.25;
       
       // take the values from the user
       System.out.println("Please enter the width:");
       width = input.nextFloat();
       System.out.println("Please enter the height:");
       height = input.nextFloat();
       
       area = calculateArea (width, height);
       perimeter = calculatePerimeter(width, height);
       
       double convertArea = Double.valueOf(area);
       double convertPerimeter = Double.valueOf(perimeter);
       System.out.println("The cost of glass is: " + convertArea * glassCost);
       System.out.println("The cost of trim is: " + convertPerimeter * trimCost);
       
   
    }
    
    // calculate the perimeter
    public static float calculatePerimeter(float width, float height){
    
        return ((width + height) * 2);
   
    
    }
    
    //calculate area
    public static float calculateArea(float width, float height){
    return (width * height);
    }
    
    
    
}
