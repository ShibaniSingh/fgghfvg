/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intervalprime;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class IntervalPrime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the interval");
        int k=0;
        int[] prime=new int[100];
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            for(int j=2;j<i;j++)
            {
            while(i!=0)
            {
                if(i%j==0)
                {
                    break;
                }
            
            if(j==i)
            {
                prime[k++]=i;
            
                for(k=0;k<i;k++)
                {
                    System.out.println(k);
                
                }
            }
            }
        }
    }
    }}
