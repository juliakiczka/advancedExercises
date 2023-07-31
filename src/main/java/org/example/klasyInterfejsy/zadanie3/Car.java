package org.example.klasyInterfejsy.zadanie3;

public class Car {
    private String name;
    private String type;
    private Engine engine;

    public Car(String name, String type) {
        this.name = name;
        this.type = type;
        engine = new Car.Engine();
        engine.setEngine(type);
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

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", engine=" + engine +
                '}';
    }

    public class Engine {
        private String engineType;

        public void setEngine(String engineType) {
            if (engineType.equals("economy")) {
                this.engineType = "diesel";
            } else if (engineType.equals("luxury")) {
                this.engineType = "electric";
            } else {
                this.engineType = "petrol";
            }
        }
    }

}
