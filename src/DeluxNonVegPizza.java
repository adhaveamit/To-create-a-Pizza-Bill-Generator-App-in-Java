public class DeluxNonVegPizza extends Pizza {
    public DeluxNonVegPizza() {
        super("Delux Non-Veg Pizza", 650);
        this.extraCheese = true;
        this.extraToppings = true;
    }

    @Override
    public double calculatePrice() {
        return basePrice; // Deluxe pizzas have fixed price
    }
}
