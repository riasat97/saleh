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
public class MatrixAdd {
    public static void main(String[] args) {
        //with out using method read the following link
        //https://www.programmingsimplified.com/java/source-code/java-program-add-matrices
        int m,n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix");
         m = in.nextInt();
         n  = in.nextInt();
        
        int arr1[][]=inputArr(m,n);
        int arr2[][]=inputArr(m,n);
        int res[][]=new int[m][n];
        outputArr(arr1,arr2,res);
    }

    private static int[][] inputArr(int m,int n) {
        int i,j;
        Scanner in = new Scanner(System.in);
        int arr[][]=new int[m][n]; 
        System.out.println("Enter " + arr.length + " rows and " + arr[0].length + " columns: ");
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr[i].length;j++)
                arr[i][j]=in.nextInt();
        }
        return arr;
    }

    private static void outputArr(int[][] arr1, int[][] arr2, int[][] res) {
        int i,j;
        for(i=0;i<res.length;i++){
            for(j=0;j<res[i].length;j++){
                res[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(res[i][j]);
            }
             System.out.println();
        }
    }
    
}
