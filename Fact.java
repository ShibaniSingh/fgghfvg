/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fact;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Fact {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Enter the number");
       int fact=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       for(int i=1;i<=n;i++)
       {
            fact=fact*i;
           //System.out.println(fact);
       }
        System.out.println(fact);
    }
}
