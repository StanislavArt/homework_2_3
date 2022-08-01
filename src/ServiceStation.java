public class ServiceStation {
    public void check(Transport transport) {
        System.out.println("\nОбслуживаем " + transport.getModelName());
        transport.checkTransport();
    }

    // пример перегрузки
    public void check(Transport transport1, Transport transport2) {
        System.out.println("\nОбслуживаем " + transport1.getModelName());
        transport1.checkTransport();
        System.out.println("\nОбслуживаем " + transport2.getModelName());
        transport2.checkTransport();
    }
}
