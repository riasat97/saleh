/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saleh;
class Min{  
static int ninim(int a,int b){return (a<=b)?a:b;}  
static double ninim(double a,double b){return (a<=b)?a:b;}  
} 
public class OverloadMin {
     public static void main(String[] args)
      {
          System.out.println(Min.ninim(1,2));  
          System.out.println(Min.ninim(3.0,2.0));  
      }    
}
