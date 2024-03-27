package observer;

import java.util.*;

public class WeatherData implements Subject{

    private List<observer.Observer> observers;
    private float temperature;

    private float humidity;

    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<observer.Observer>();
    }

    public void registerObserver(observer.Observer o) {
        observers.add(o);
    }

    public void removeObserver(observer.Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return  humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
