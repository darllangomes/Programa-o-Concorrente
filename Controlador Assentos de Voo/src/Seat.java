public class Seat {
    private String name;
    private Passenger passenger;

    public Seat(String name) {
        this.name = name;
        this.passenger = null;
    }

    public boolean isAvailable() {
        return passenger == null;
    }



    public Passenger getPassenger() {
        return passenger;
    }

    public String getName() {
        return name;
    }
}
