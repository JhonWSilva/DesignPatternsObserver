package Observer;

public class Display2 implements Observer {
    public void update(float temperature, float pressure, float humidity) {
        System.out.println("Display2: Temperatura = " + temperature + " Pressão = " + pressure + " Umidade = " + humidity);
    }
}
