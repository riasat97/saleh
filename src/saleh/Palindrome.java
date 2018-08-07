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
public class Palindrome {
     public static void main(String[] args) {
             //converts string to lowercase and replaces everything except numbers
             // and alphabets
        String s ;
        //check output: "Niagara. O roar again!".toLowerCase().replaceAll("\\W", "");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        s = input.nextLine();

        s = s.replaceAll("\\W", "");
        s = s.toLowerCase();
        int j=0;
        int k = s.length() - 1;
        while(j < s.length() / 2) { //loops until half the length of the string if 
                                        //even and floor value if odd.
            if (s.charAt(j++) != s.charAt(k--)){//check for first and last chars                                                                                                
                                              //and  go inwards. if char do not match print 'Not a Palindrome' and exit 
                System.out.println("Not a Palindrome");
            System.exit(0);}
        }
        System.out.println("Palindrome");  //if every chars match print "Palindrome"
    }
}
