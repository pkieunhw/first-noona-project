package observerPattern;

public interface observer {
    void update(float temperature, float humidity, float pressure); // 상태 변경 시 업데이트
}
