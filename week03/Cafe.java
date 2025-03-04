public class Cafe {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        Barista barista = new Barista();

        Dish dish = barista.takeOutPlate();
        String coffee = barista.makeCoffee();
        dish.plating(coffee);

        waiter.takeByHand(dish);

        System.out.println(waiter.lookAtHand());

    }
}
