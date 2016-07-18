/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fibo;

/**
 *
 * @author Student
 */
public class Fibo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
{    
 int n1=0,n2=1,n3,i,j=10;    
 System.out.print(n1+" "+n2); 
    
 for(i=2;i<j;++i)
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
    }
    }
}

