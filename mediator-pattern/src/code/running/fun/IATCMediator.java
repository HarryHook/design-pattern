package code.running.fun;

public interface IATCMediator {

    void registerRunway(Runway runway);

    void registerFlight(Flight flight);

    boolean isLandingOk();

    void setLandingStatus(Boolean landingStatus);
}
