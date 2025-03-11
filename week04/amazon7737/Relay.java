package Week04;

import java.util.Arrays;

public class Relay {
    public static void main(String[] args) {

        // 달리기선수당 가속도 달리기 빠른애는 선수 입장할때부터 이미 빠른애임.
        // 이어달리기를 한다.
        // 경기(Stage)
        // 경주자
        // 달리기를 한다.

        Stage stage = new Stage(5);

        stage.playersPosition("경주자1", 100); // 1번 경주자 입장
        stage.playersPosition("경주자2", 150); // 2번 경주자 입장
        stage.playersPosition("경주자3", 90); // 3번 경주자 입장
        stage.playersPosition("경주자4", 80); // 4번 경주자 입장

        // 레일경로는 일직선 경로라고 가정했을경우에
        // 출발했다.
        // 시간 1초 , 2초 3초...

        while (true) { // 경기진행
            if(stage.getNowPlayTime() == stage.getTotalPlayTime()){
                break;
            }
            stage.matchRank();
            stage.plusPlayTime();
        }

        stage.getNowRank();
        // 경기 시간이 종료되면 자동으로 종료
    }
}
