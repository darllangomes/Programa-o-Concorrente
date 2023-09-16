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

    public boolean allocatePassenger(Passenger passenger) {
        if (isAvailable()) {
            this.passenger = passenger;
            return true;
        }
        return false;
    }


    public Passenger getPassenger() {
        return passenger;
    }

    public String getName() {
        return name;
    }
}
