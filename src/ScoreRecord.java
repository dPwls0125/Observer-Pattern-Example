import java.util.ArrayList;
import java.util.List;

// Concrete Subject
public class ScoreRecord extends Subject{

    // 점수 저장 클래스
    List<Integer> scores = new ArrayList<Integer>();

    // 새로운 점수를 추가 (상태 변경)
    public void addScore(int score) {
        scores.add(score); // scores 리스트에 score 추가 => 리스트 변경 발생
        notifyObservers(); // 데이터가 변경되었음을 각 통보 대상(Observer)에게 통보
    }

    public List<Integer> getScoreRecord() {
        return scores;
    }
}
