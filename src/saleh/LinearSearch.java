package saleh;

import java.util.Scanner;

/**
 *
 * @author Envy
 */
public class LinearSearch {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int n,i,key;
       System.out.println("Enter number of elements :");
       n=in.nextInt();
       int arr[]=new int[n];
       for(i=0;i<arr.length;i++){
            System.out.println("Enter element "+(i+1)+":");
            arr[i]=in.nextInt();
       }
                    
       System.out.println("Enter key to search :");
       key=in.nextInt();
       int res=linearSearch(arr,key);
       if(res>=0)System.out.println("Item found at position :"+(res+1));//print only res to show index
       else System.out.println("Item not found");
   }   

    private static int linearSearch(int[] arr,int key) {
       int i;
       for(i=0;i<arr.length;i++){
           if(arr[i]==key)
               return i;
       }
       return -1;
    }
}
