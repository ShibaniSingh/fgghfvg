/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package odd;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Odd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==1)
        {
            System.out.println("The no is odd");
            
        }
        else 
        {
            System.out.println("The no is even");
        }
    }
}
