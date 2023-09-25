/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiiiiiibasictemp;

import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author Fedrequilan_CPE
 */
public class HiiiiiiBasictemp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Scanner input=new Scanner (System.in);
        System.out.println("Select operation"
                + " 1: Celcius to Fahrenheit"
                + " 2: Fahrenheit to Celcius"
                + " 3: Kelvin to Fahrenheit"
                + " 4: Fahrenheit to Kelvin"
                + " 5: Kelvin to Celcius"
                + " 6: Celcius to Kelvin") ;
        int a = input.nextInt();
        
        if (a==1) { 
            System.out.println (" Enter No. of Celcius");
            int c = input.nextInt();
            double ans = (c*9/5) + (32);
            System.out.println("The answer is:" + ans + " Fahrenheit");
        } 
        
        else if (a==2){
                 System.out.println ("Enter No. of Fahrenheit");
                int c = input.nextInt();
                float ans = (c-32) * 5/9f;
                System.out.println("The answer is:" + ans + " Celcius");
        }
        else if (a==3){
                 System.out.println ("Enter No. of Kelvin");
                int c = input.nextInt();
                float ans = ((c - 273.15f)*9/5 + 32);
                System.out.println("The answer is:" + ans+ " Fahrenheit");
        } 
         else if (a==4){
                 System.out.println ("Enter No. of Fahrenheit");
                double c = input.nextInt();
                double ans = (((c - 32)*5/9)+ 273.15) ;
                System.out.println("The answer is:" + ans + " Kelvin");
        }
         
         else if (a==5){
                 System.out.println ("Enter No. of Kelvin");
                int c = input.nextInt();
                double ans = (c - 273.15) ;
                System.out.println("The answer is:" + ans + " Celcius");
        } 
        else if (a==6){
                 System.out.println ("Enter No. of Celcius");
                int c = input.nextInt();
                double ans = (c + 273.15) ;
                System.out.println("The answer is:" + ans + " Kelvin");
        }
}
}