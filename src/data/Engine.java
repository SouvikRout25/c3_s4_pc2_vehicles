package data;

public class Engine {
    private String modelNo;
    private double maxPower;
    private int maxRPM;

    public Engine(String modelNo, double maxPower, int maxRPM) {
        this.modelNo = modelNo;
        this.maxPower = maxPower;
        this.maxRPM = maxRPM;
    }
    public String getModelNo() {return modelNo;}
    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }
    public double getMaxPower() {
        return maxPower;
    }
    public void setMaxPower(double maxPower) {
        this.maxPower = maxPower;
    }
    public int getMaxRPM() {
        return maxRPM;
    }
    public void setMaxRPM(int maxRPM) {
        this.maxRPM = maxRPM;
    }


    public void display(){
        System.out.println("modelNo = " + modelNo);
        System.out.println("maxPower = " + maxPower +"kW");
        System.out.println("maxRPM = " + maxRPM);
    }
}
