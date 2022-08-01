public class Truck extends Transport implements ServiceFull{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkTransport() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
