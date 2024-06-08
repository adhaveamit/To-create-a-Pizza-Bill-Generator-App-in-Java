public class DeluxVegPizza extends Pizza {
    public DeluxVegPizza() {
        super("Delux Veg Pizza", 550);
        this.extraCheese = true;
        this.extraToppings = true;
    }

    @Override
    public double calculatePrice() {
        return basePrice; // Deluxe pizzas have fixed price
    }
}
