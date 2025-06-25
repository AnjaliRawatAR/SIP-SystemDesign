package L;

public class Client {
    public static void main(String[] args) {
        Vehicle v = new Car();
        Vehicle v1 = new Cycle();
        Car_Dekho c = new Car_Dekho(v1);
        Car_Dekho c1 = new Car_Dekho(v);
    }
}
