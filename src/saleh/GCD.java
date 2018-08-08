/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saleh;

/**
 *
 * @author Envy
 */
public class GCD {

    public static void main(String[] args) {

        int n1 = 81, n2 = 153;

        while(n1 != n2)
        {
            if(n1 > n2)
                n1 -= n2;
            else
                n2 -= n1;
        }

        System.out.println("G.C.D = " + n1);
    }
}
