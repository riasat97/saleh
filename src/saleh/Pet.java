/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saleh;

import java.util.ArrayList;
import java.util.Scanner;

class Petobj {
    
        public String name;
        public char type;
        public Petobj(String name,char type){
           this.name=name;
           this.type=type;
       }
}
public class Pet {
    public static void main(String[] args) {
       String name,terminate="stop"; 
       char type;
       Scanner input = new Scanner(System.in);
       ArrayList<Petobj> list=new ArrayList<Petobj>();
       while(true){
           
           System.out.println("Pet name:");
           name=input.next();
           if(terminate.equalsIgnoreCase(name))break;
           System.out.println("Enter d for dog or c for cat");
           type = input.next(".").charAt(0);
           Petobj p=new Petobj(name,type);
           list.add(p);
       }
       
        for(Petobj p : list){
           System.out.println("Name:"+p.name); 
           System.out.println("Type:"+p.type); 

        }
            
    }
}
