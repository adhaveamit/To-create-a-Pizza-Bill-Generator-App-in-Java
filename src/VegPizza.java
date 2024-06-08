public class VegPizza extends Pizza {
    public VegPizza() {
        super("Veg Pizza", 300);
    }

    @Override
    public double calculatePrice() {
        double totalPrice = basePrice;
        if (extraCheese) {
            totalPrice += 100;
        }
        if (extraToppings) {
            totalPrice += 150;
        }
        return totalPrice;
    }
}
