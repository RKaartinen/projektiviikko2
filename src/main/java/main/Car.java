package main;

public class Car {
    private String brand;
    private String model;
    private int speed;
    private int accelerate;
    private int decelerate;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
            return;
        }
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setAccelerate(int accelerate) {
        if (accelerate < 0) {
            System.out.println("Nopeuden täytyy olla positiivinen luku.");
            return;
        }
        this.accelerate = accelerate;
    }

    public int getAccelerate() {
        return accelerate;
    }

    public void setDecelerate(int decelerate) {
        if (decelerate < 0) {
            System.out.println("Nopeuden täytyy olla positiivinen luku.");
            return;
        }
        this.decelerate = decelerate;
    }

    public int getDecelerate() {
        return decelerate;
    }

    public void printSpecs() {
        System.out.println("Auto: " + getBrand() + " " + getModel() +", Nopeus: " + speed + " km/h");
    }
}
