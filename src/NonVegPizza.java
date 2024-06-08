public class NonVegPizza extends Pizza {
    public NonVegPizza() {
        super("Non-Veg Pizza", 400);
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
