package data;

public class ElectricEngines extends Engine{
    private int voltage;

    public ElectricEngines(String modelNo, double maxPower, int maxRPM, int voltage) {
        super(modelNo, maxPower, maxRPM);
        this.voltage = voltage;
    }
    public int getVoltage() {
        return voltage;
    }
    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }
    @Override
    public void display() {
        System.out.println("Electric Engine Details");
        super.display();
        System.out.println("voltage = " + voltage +"V");
    }
}
