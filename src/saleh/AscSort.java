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
public class AscSort {
     public static void main(String[] args) {
           
        int n,i;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        n = input.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++)
            arr[i]=input.nextInt();
        sortArray(arr);        
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        int i;
        System.out.println("In asending order :");
        for(i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }

    private static void sortArray(int[] arr) {
        int i,j,temp;
        for(i=0;i<arr.length-1;i++){
            for(j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                   temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
            }
        }
    }
}
