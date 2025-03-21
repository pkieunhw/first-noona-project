package observerPattern;

import javax.security.auth.Subject;

public class CurrentConditionsDisplay  implements  Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
}
