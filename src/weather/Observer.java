package weather;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}

//anyone wants to observe must have update method
