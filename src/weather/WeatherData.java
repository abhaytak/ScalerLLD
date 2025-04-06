package weather;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
        System.out.println("Registered Observer");
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
        System.out.println("Removed Observer");
    }

    @Override
    public void notifyObservers() {
        System.out.println("***** Notifying Observers *****");
        for (Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }

    //as soon as the changes in the weather
    public void measurementsChanged() {
        //if wants to do something else before notifying the observer

        notifyObservers();
    }

    //this is called weather station
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
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
