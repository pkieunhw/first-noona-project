package observerPattern;

public interface Subject {
    void registerObserver(Observer o); // 옵저버 등록
    void removeObserver(Observer o);   //옵저버 제거
    void notifyObservers();            // 모든 옵저버에게 알림
}
