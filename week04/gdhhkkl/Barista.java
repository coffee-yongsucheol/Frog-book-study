package Caffe;

public class Barista {

    private Food food;

    private String[] cup = {"short", "tall", "grande"};

    private int result;

    private String blackSugar;

    public String getBlackSugar(){
        System.out.println(blackSugar);
        return this.blackSugar;
    }

    public void order(int milk, int sugar, int coffeeBin){
        food = new Food();//Food 타입을 하면 걍 초기화됨

        food.putMilk(milk);
        food.putSugar(sugar);
        food.putCoffeeBin(coffeeBin);
    }

    public int putTogether(){

       int milk = food.getMilk();

       int sugar = food.takeSugar();

       int coffeeBin =  food.takeCoffeeBin();

       result = milk+sugar+coffeeBin;

       return result;

    }



    public String putCup(int result){
        this.result =result;

        if(result>=8){
            blackSugar= cup[2];
//            System.out.println(blackSugar);
        }else if(result>=4){
            blackSugar =cup[1];
//            System.out.println(blackSugar);
        }else if(result>=2){
            blackSugar =cup[0];
//            System.out.println(blackSugar);
        }
        return blackSugar;
    }









}
