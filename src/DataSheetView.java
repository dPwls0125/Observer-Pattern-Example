import java.util.List;

public class DataSheetView implements Observer{

    private ScoreRecord scoreRecord;
    private int viewCount;

    public DataSheetView(ScoreRecord scoreRecord, int viewCount) {
        this.scoreRecord = scoreRecord;
        this.viewCount = viewCount;

    }

    @Override
    public void update() {
        List<Integer> currentScores = scoreRecord.getScoreRecord();
        displayScores(currentScores);
    }

    public void displayScores(List<Integer> record) {
        System.out.print("List of Scores: ");
        for(int i=0; i<record.size() && i<viewCount; i++) {
            System.out.print(record.get(i) + " ");
        }
        System.out.println();
    }

}
