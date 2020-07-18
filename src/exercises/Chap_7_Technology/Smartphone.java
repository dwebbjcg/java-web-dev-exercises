package exercises.Chap_7_Technology;

public class Smartphone extends Computer {
    public String modelName = "Samsung Galaxy S10";
    private int serialNumber = 973;
    public String powerSource = "5V DC Adapter Cord";
    public boolean isOn = true;
    private boolean appOpen = true;

    public Smartphone(String modelName, int serialNumber, String powerSource, boolean isOn) {
        super(modelName, serialNumber, powerSource, isOn);
    }

    public boolean appIsOpen() {
        return appOpen;
    }
}