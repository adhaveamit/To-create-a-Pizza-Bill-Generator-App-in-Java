import java.util.Scanner;

public class PizzaBiLLGenerate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("");
        System.out.println("----------------------------------- Welcome to geTPiZZas -----------------------------------");
        System.out.println("");
        System.out.println("1. Veg Pizza");
        System.out.println("2. Non-Veg Pizza");
        System.out.println("3. Delux Veg Pizza");
        System.out.println("4. Delux Non-Veg Pizza");
        System.out.println("");
        System.out.print("Please select the type of Pizza : ");

        int choice = scanner.nextInt();
        Pizza pizza = null;

        switch (choice) {
            case 1:
                pizza = new VegPizza();
                break;
            case 2:
                pizza = new NonVegPizza();
                break;
            case 3:
                pizza = new DeluxVegPizza();
                break;
            case 4:
                pizza = new DeluxNonVegPizza();
                break;
            default:
                System.out.println("Invalid choice!");
                System.exit(0);
        }

        if (pizza instanceof VegPizza || pizza instanceof NonVegPizza) {
            System.out.println("--------------------------------------------------------------------------------------------");
            System.out.print("Would you like extra Cheese? (yes/no): ");
            if (scanner.next().equalsIgnoreCase("yes")) {
                pizza.addExtraCheese();
            }
            System.out.print("Would you like extra Toppings? (yes/no): ");
            if (scanner.next().equalsIgnoreCase("yes")) {
                pizza.addExtraToppings();
            }
        }

        pizza.printBill();
        scanner.close();
    }
}
