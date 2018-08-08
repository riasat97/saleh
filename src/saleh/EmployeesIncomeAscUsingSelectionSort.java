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
public class EmployeesIncomeAscUsingSelectionSort {
    public static void main(String[] args) {
        int n,i;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of Employees: ");
        n = input.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++){
            System.out.println("Enter Employee "+(i+1)+" income :");
            arr[i]=input.nextInt();
        }          
        sortArray(arr);//selection sort        
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        int i;
        System.out.println("Income In asending order :");
        for(i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }

    private static void sortArray(int[] arr) { //Selection Sort
        int i,j,temp,min;
        for(i=0;i<arr.length-1;i++){
            min=i;
            for(j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j])
                    min=j;
            }     
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;            
        }
    }
    
}
