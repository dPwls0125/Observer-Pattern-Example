import java.util.Collections;
import java.util.List;

public class MinMaxView implements Observer {

    private ScoreRecord scoreRecord;

    public MinMaxView(ScoreRecord scoreRecord) {
        this.scoreRecord = scoreRecord;
    }

    // 점수의 변경을 통보받음
    public void update() {
        List<Integer> record = scoreRecord.getScoreRecord();
        displayMinMax(record);
    }

    // 최소값고 최대값을 출력함
    public void displayMinMax(List<Integer> record) {
        int min = Collections.min(record, null);
        int max = Collections.max(record, null);
        System.out.println("Min: " + min + ", Max: " + max);
    }


}
