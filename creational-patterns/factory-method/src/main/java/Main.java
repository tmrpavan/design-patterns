public class Main {
    public static void main(String[] args) {
        //Transport Type is Road
        Logistics rodeLogistics = new  RoadLogistics();
        rodeLogistics.transport();

        //Transport Type is Sea
        Logistics seaLogistics = new SeaLogistics();
        seaLogistics.transport();
    }
}
