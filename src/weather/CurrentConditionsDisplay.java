package weather;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + " F degrees and " + humidity + " % Humidity ");
    }

    //why again registering once registered at the constructor?
    //obj will be created once
    //suppose you registered at constructor -> you deregistered -> again wants to registered
    public void registerToGetUpdate()
    {
        this.weatherData.registerObserver(this);
    }

    public void deregistered()
    {
        this.weatherData.removeObserver(this);
    }

    //if wants to change the provider from a to b
    public void changeProvider(Subject weatherData)
    {
        this.weatherData = weatherData;
    }
}
