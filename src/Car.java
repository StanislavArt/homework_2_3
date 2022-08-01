public class Car extends Transport implements ServiceExtended {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkTransport() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
