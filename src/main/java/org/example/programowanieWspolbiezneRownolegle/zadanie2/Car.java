package org.example.programowanieWspolbiezneRownolegle.zadanie2;

public class Car {

    private String name;
    private String type;

    public Car(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Bridge{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
