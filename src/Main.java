public class Main {
    public static void main(String[] args) {

        ScoreRecord scoreRecord = new ScoreRecord();

        DataSheetView dataSheetView = new DataSheetView(scoreRecord,3);
        MinMaxView mindMaxView = new MinMaxView(scoreRecord);

        scoreRecord.attach(dataSheetView);
        scoreRecord.attach(mindMaxView);

        for(int i=1; i<=5; i++){
            int score = 10 * i;
            System.out.println();
            System.out.println("Adding score : " + score);
            scoreRecord.addScore(score); // score이 변경됨과 동시에 observers에게 통보가가고 반영된 view가 출력됨
        }

    }
}
