package data;

public class ICEngine extends Engine{
    private int displacement;
    private int noOfCylinder;
    private String typeOfFuel;

    public ICEngine(String modelNo, double maxPower, int maxRPM, int displacement, int noOfCylinder, String typeOfFuel) {
        super(modelNo, maxPower, maxRPM);
        this.displacement = displacement;
        this.noOfCylinder = noOfCylinder;
        this.typeOfFuel = typeOfFuel;
    }

    public int getDisplacement() {
        return displacement;
    }
    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }
    public int getNoOfCylinder() {
        return noOfCylinder;
    }
    public void setNoOfCylinder(int noOfCylinder) {
        this.noOfCylinder = noOfCylinder;
    }
    public String getTypeOfFuel() {
        return typeOfFuel;
    }
    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("displacement = " + displacement );
        System.out.println("noOfCylinder = " + noOfCylinder);
        System.out.println("typeOfFuel = " + typeOfFuel);
    }
}
