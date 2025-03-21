package observerPattern;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList observers; //Observer객체들을 저장할 ArrayList
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o){
        observer.add(0);


    }
    @Override
    public void removeObserver(Observer o){
        observers.remove(o);

    }
    @Override
    public void notifyObservers(){
        for (Observer observer : observers){
            observer.update(temperature, humidity, pressure);

        }
    }

    public  void  measurementsChangerd(){
        notifyObservers();

    }

    public void setMeasurements(float temtemperature, float humidity, float pressure){
        this.temtemperature = temtemperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChangerd();
    }
    //게터메소드
}
// 현재 기상상태를 출력하는 옵저버
