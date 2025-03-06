public class Waiter {
    private Dish hand;

    public String lookAtHand() {
        return this.hand.inDish();
    }

    public void takeByHand(Dish dish) {
        this.hand = dish;
    }
}
