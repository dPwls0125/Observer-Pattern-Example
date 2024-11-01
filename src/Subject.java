import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    // 추상화된 통보대상(관찰자) 목록
    public List<Observer> observers = new ArrayList<Observer>();

    // 통보 대상(Observer) 추가
    public void attach(Observer observer) {
        observers.add(observer);
    }
    // 통보 대상(Observer) 제거
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    // 각 통보 대상(Observer)에게 변경을 통보
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }

}
