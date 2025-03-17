
import java.util.Arrays;

public class Stage {
    private int totalPlayTime;
    private int nowPlayTime;
    private Runner[] rank =new Runner();

    public Stage(int totalPlayTime){
        this.totalPlayTime = totalPlayTime;
    }

    public void playersPosition(String runnerName, int speed){
        accountRank(new Runner(runnerName, speed));
    }

    public int getTotalPlayTime(){
        return this.totalPlayTime;
    }

    public int getNowPlayTime(){
        return this.nowPlayTime;
    }

    public void plusPlayTime(){
        this.nowPlayTime++;
    }

    
}
