package weather;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        //created new subscriber
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        //internally notify method is being called
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(80, 70, 29.2f);
        weatherData.setMeasurements(80, 90, 29.2f);


        //unregistering the measurement
        currentConditionsDisplay.deregistered();
        //again updating the change
        weatherData.setMeasurements(81, 65, 30.4f);
        currentConditionsDisplay.registerToGetUpdate();
        weatherData.setMeasurements(99, 70, 29.2f);
    }
}
