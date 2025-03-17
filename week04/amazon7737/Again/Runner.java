public class Runner {
    private String name;
    private int speed;
    private String type ="정지";
    private int distance;
    //실무에서 상속을 쓰는 이유는 예를 들어 은행 API를 사용해서 하려니 다른 은행사도
    //우리꺼 써ㅏ고 주면 은행1,은행2 이렇게 두면 안되니 '은행'이라는 인터페이스를 두고 가각 상속해서 담아서 쓰면 된다. 이럴때 상속을 쓴다 

    public Runner(String runnerName, int speed){
        this.name = runnerName;
        thsi.speed = speed;
        //왜 반환 타입을 클래스로 하냐 그건 난중에 반환할께 많아지면 복잡해지니 그걸 쉽게 하기이해 반혼한것 
        //클래스로 묶어서 보내면 한 무텅이로 보내는거라 생각하면 됨됨
    }
    
    public void plusDistance(){
        this.distance += this.speed;
    }

    public int getSpeed(){
        return this.speed;
    }
    public String getName(){
        return this.name;
    }
}
