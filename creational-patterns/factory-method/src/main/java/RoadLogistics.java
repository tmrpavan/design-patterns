public class RoadLogistics extends Logistics {
    @Override
    protected Transport createTransport() {
        return new TruckTransport();
    }
}
