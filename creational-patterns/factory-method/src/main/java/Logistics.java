public abstract class Logistics {
    protected abstract Transport createTransport();

    public void transport(){
        Transport transport = createTransport();
        transport.doTransport();
    }
}
