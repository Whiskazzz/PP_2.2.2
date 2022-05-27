package web.model;


public class Car {
    long serialNum;
    int weight;
    String model;

    public Car() {
    }
    public Car(long serialNum, int weight, String model) {
        this.serialNum = serialNum;
        this.weight = weight;
        this.model = model;
    }

    public long getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(long serialNum) {
        this.serialNum = serialNum;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
