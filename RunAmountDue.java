import java.util.*;
public class RunAmountDue {
    public static void main(String []arg) {
    Scanner sc = new Scanner(System.in);
    AmountDue due = new AmountDue();
    System.out.println("Press any of the following then enter values separated by spaces:");
    System.out.println("1 - price only");
    System.out.println("2 - price and quantity");
    System.out.println("3 - price, quantity, and discount amount");

    int userInput = sc.nextInt();
    double price, discount;
    int quantity;
    
    switch (userInput){
        case 1:
            System.out.println("\"1 - price only\"");
            price =sc.nextDouble();
            System.out.println("Amount due is:" + due.computeAmountDue(price));
            break;
        case 2:
            System.out.println("\"2 - price and quantity\"");
            price =sc.nextDouble();
            quantity =sc.nextInt();
            System.out.println("Amount due is:" + due.computeAmountDue(price, quantity));
            break;
        case 3:
            System.out.println("\"3 - price, quantity, and discount amount\"");
            price =sc.nextDouble();
            quantity =sc.nextInt();
            discount =sc.nextDouble();
            System.out.println("Amount due is:" + due.computeAmountDue(price, quantity, discount));
            break;
        default:
         System.out.println("Invalid Input");
    }
    }
}
class AmountDue
{

	public double computeAmountDue(double price) {
		double total = price + (price * 0.12);
		return total;
	}

	public double computeAmountDue(double price, int quantity) {
		double total = price + (price * quantity) * 0.12;
		return total;
	}

	public double computeAmountDue(double price, int quantity, double discount) {
		double total = ((price * quantity) - discount) + (price  * 0.12);
		return total;
	}
}


