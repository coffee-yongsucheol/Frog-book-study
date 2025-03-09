package Caffe;

public class Food {
    private int milk;
    private int sugar;
    private int coffeeBin;


    public int getMilk(){
        return this.milk;
    }
    public int takeSugar(){
        return this.sugar;
    }
    public int takeCoffeeBin(){
        return this.coffeeBin;
    }

    public void putMilk(int milk){
        this.milk =milk;
    }
    public void putSugar(int sugar){
        this.sugar = sugar;
    }
    public void putCoffeeBin(int coffeeBin){
        this.coffeeBin = coffeeBin;
    }


}
