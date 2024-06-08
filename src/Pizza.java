public abstract class Pizza {
    protected String type;
    protected double basePrice;
    protected boolean extraCheese;
    protected boolean extraToppings;

    public Pizza(String type, double basePrice) {
        this.type = type;
        this.basePrice = basePrice;
        this.extraCheese = false;
        this.extraToppings = false;
    }

    public void addExtraCheese() {
        this.extraCheese = true;
    }

    public void addExtraToppings() {
        this.extraToppings = true;
    }

    public abstract double calculatePrice();

    public void printBill() {
        System.out.println("Pizza Type: " + type);
        System.out.println("Base Price: ₹" + basePrice);
        if (extraCheese) {
            System.out.println("Extra Cheese: ₹100");
        }
        if (extraToppings) {
            System.out.println("Extra Toppings: ₹150");
        }
        System.out.println("");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Total Price: ₹" + calculatePrice());
        System.out.println("");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Thank You !");
    }
}
