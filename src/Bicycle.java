class Bicycle extends Vehicle {

    Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Проверяем электромотор");
    }
}
