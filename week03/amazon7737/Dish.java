public class Dish {

    private String food;

    public static Dish onTheDish() {
        return new Dish();
    }

    public String inDish() {
        return this.food;
    }

    public void plating(String food) {
        this.food = food;
    }
}
