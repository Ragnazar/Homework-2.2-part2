class Truck extends Vehicle {
    Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку грузового автомобиля");
    }
}
