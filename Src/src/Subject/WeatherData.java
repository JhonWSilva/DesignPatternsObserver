package Subject;

import Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private List<Observer> observers;
    private float temperature;
    private float pressure;
    private float humidity;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, pressure, humidity);
        }
    }

    // Método para atualizar os valores de temperatura, pressão e umidade
    public void setMeasurements(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementsChanged();
    }

    // Método para notificar os observadores sobre as mudanças nos valores
    public void measurementsChanged() {
        notifyObservers();
    }

}
