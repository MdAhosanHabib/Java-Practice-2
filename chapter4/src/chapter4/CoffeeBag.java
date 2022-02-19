package chapter4;

public class CoffeeBag {
    public void priceGet(int numberOfBags,int bagWeight) {
    double pricePerLb = 5.99;
    double taxrate = 7.25;
    
    double totalPrice = bagWeight * numberOfBags * pricePerLb;
    double totalPriceWithTax = totalPrice + (totalPrice / 100) * taxrate;
    
    System.out.println("------------------------------");
    System.out.println("Number of bags sold: "+numberOfBags);
    System.out.println("Weight per bag: "+bagWeight+" lb");
    System.out.println("Price per pound: $5.99");
    System.out.println("Sales tax: 7.25%");
    System.out.println();
    System.out.printf("Total price: $ %.2f \n", totalPriceWithTax);
    System.out.println();
    }
}
