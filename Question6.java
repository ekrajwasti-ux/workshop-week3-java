package Workshop3;
class Lamp {
    boolean isOn;

    public void turnOn() {
        isOn = true;
        System.out.println("Lamp is ON: " + isOn);
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Lamp is ON: " + isOn);
    }
}

public class Question6 {
	public static void main(String[] args) {

	      
        Lamp l = new Lamp();

      
        l.turnOn();

      
        l.turnOff();
    }
}
