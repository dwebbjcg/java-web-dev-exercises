package exercises.Chap_7_Technology;

public class Computer extends AbstractID {
    public String modelName;
    private int serialNumber;
    public String powerSource;
    public boolean isOn = true;

//    public Computer() {
//        int id = nextId;
//        nextId++;
//    }

    public Computer(String modelName, int serialNumber, String powerSource, boolean isOn) {
//        this();
        this.modelName = modelName;
        this.serialNumber = serialNumber;
        this.powerSource = powerSource;
        this.isOn = isOn;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public boolean poweredOn() {
        return isOn;
    }

    public String downloadFile(String fileName) {
        return "Download successful!";
    }
}
