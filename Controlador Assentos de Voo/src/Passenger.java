public class Passenger {
    private String name;
    private int selectedSeats = 0;

    public Passenger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSelectedSeats() {
        return selectedSeats;
    }

    public void incrementSelectedSeats() {
        selectedSeats++;
    }
}
