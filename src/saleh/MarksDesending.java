package saleh;

import java.util.Scanner;
public class MarksDesending {
    public static void main(String args[]){
      
           
        int n,i;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of Students: ");
        n = input.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++){
             System.out.println("Enter Exam marks of student "+(i+1));
             arr[i]=input.nextInt();
        }
        sortArray(arr);//bubble sort in desending order        
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        int i;
        System.out.println("Marks in desending order :");
        for(i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }

    private static void sortArray(int[] arr) {
        int i,j,temp;
        for(i=0;i<arr.length-1;i++){
            for(j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                   temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
            }
        }
    }
    
}
