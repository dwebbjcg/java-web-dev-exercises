package exercises.Chap_7_Technology;

public class Laptop extends Computer {
    public String modelName = "Apple Macbook Pro";
    private int serialNumber = 100912;
    public String powerSource = "60W DC Adapter Cord ";
    public boolean isOn = true;

    public Laptop(String modelName, int serialNumber, String powerSource, boolean isOn) {
        super(modelName, serialNumber, powerSource, isOn);
    }

     public String getPowerLevel() {
        return "Power is sufficient.";
     }
}