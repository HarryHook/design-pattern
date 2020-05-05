package code.running.fun;

public class Client {

    public static void main(String[] args) {
        IATCMediator atcMediator = new ATCMediator();

        Flight flight = new Flight(atcMediator);
        Runway runway = new Runway(atcMediator);

        atcMediator.registerFlight(flight);
        atcMediator.registerRunway(runway);

        flight.getReady();
        flight.land();
        runway.land();
        flight.land();
    }
}
