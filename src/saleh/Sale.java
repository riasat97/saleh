
package saleh;

import java.util.Scanner;

public class Sale {
     public static void main(String[] args) {
        
        double unitWeight;
        int numberOfUnits;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of Bags sold: ");
        numberOfUnits = scanner.nextInt();
        System.out.println("Weight per bag: ");
        unitWeight = scanner.nextDouble();
        System.out.println("Price per pound: $5.99");
        System.out.println("Sales tax: 7.25%");
        double totalPrice = unitWeight*numberOfUnits*5.99;
        double totalPriceWithTax = totalPrice+totalPrice*0.0725;
        
        System.out.format("Total price: %.2f", totalPrice);
        System.out.format("\nTotal price with Tax: %.2f\n", totalPriceWithTax);
        
    }
}
