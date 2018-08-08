/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saleh;

import java.util.Scanner;

/**
 *
 * @author Envy
 */
class Charge
   {
     public static void main(String[] args)
      {
       Scanner input=new Scanner(System.in);
       float p=100;
       System.out.print("enter the units=");
       int units=input.nextInt();
       System.out.print("entr the user name=");
       String userName=input.next();
        if(units>600)
            p+=units*9.98f;        
        else if((units>401)&&(units<=600))
            p+=units*8.70f;
        else if((units>301)&&(units<=400))
            p+=units*5.63f;
        else if((units>201)&&(units<=300))
            p+=units*5.36f;
        else if((units>200)&&(units<=76))
            p+=units*5.14f;
        else if((units>=1)&&(units<=75))
            p+=units*3.80f;
        
          if(p>500)
               p=p+p*(15/100f);
             
        System.out.println("userName="+userName+" & Bill="+p);
      }
  }
