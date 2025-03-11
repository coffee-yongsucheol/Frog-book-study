package Week04;

import java.util.Arrays;

public class Stage {

    private int totalPlayTime;
    private int nowPlayTime;
    private Runner[] rank = new Runner[0];

    public Stage(int totalPlayTime) {
        this.totalPlayTime = totalPlayTime;
    }

    public void playersPosition(String runnerName, int speed) {
        accountRank(new Runner(runnerName, speed));
    }

    public int getTotalPlayTime() {
        return this.totalPlayTime;
    }

    public int getNowPlayTime() {
        return this.nowPlayTime;
    }

    public void plusPlayTime() {
        this.nowPlayTime++;
    }

    public Runner[] getNowRank() { // 현재 어떤 경주자의 랭킹을 확인
        for(int i=0; i< this.rank.length; i++){
            System.out.println(" " + this.rank[i].getName() + " 속도: " + this.rank[i].getSpeed());
        }
        return this.rank;
    }


    public void accountRank(Runner runner) { // 경주자 입력

        this.rank = Arrays.copyOf(this.rank, this.rank.length + 1);

        rank[this.rank.length - 1] = runner;

        System.out.println(Arrays.toString(this.rank));

    }

    public void matchRank() { // 경주자 속도에 따라서 등수 변경
        for(int i=0; i< this.rank.length-1; i++){
            if(this.rank[i].getSpeed() < this.rank[i+1].getSpeed()){
                Runner temp = this.rank[i];
                this.rank[i] = this.rank[i+1];
                this.rank[i+1] = temp;
            }
        }
    }



}
