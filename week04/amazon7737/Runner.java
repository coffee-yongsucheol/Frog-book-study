package Week04;

public class Runner {

    private String name;
    private int speed;
    private String type = "정지";
    private int distance;

    public Runner(String runnerName, int speed) {
        this.name = runnerName;
        this.speed = speed;
    }

    public void plusDistance(){
        this.distance += this.speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public String getName() {
        return this.name;
    }
}
