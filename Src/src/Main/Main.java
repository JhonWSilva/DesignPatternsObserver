package Main;

import Observer.Display1;
import Observer.Display2;
import Observer.Observer;
import Subject.WeatherData;


public class Main {
    public static void main(String[] args) {

        // Criação do objeto central
        WeatherData weatherData = new WeatherData();

        // Criação dos observadores
        Observer display1 = new Display1();
        Observer display2 = new Display2();

        // Registro dos observadores no objeto central
        weatherData.registerObserver(display1);
        weatherData.registerObserver(display2);

        // Atualização dos valores e notificação dos observadores
        weatherData.setMeasurements(30.0f, 1013.0f, 50.0f);

    }
}