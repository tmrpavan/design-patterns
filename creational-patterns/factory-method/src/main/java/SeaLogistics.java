public class SeaLogistics extends Logistics {
    @Override
    protected Transport createTransport() {
        return new ShipTransport();
    }
}
