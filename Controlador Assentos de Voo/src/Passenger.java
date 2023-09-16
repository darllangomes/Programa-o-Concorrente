import java.util.ArrayList;
import java.util.List;

public class Passenger {
    private String name;
    private int selectedSeats = 0; // Contador de assentos selecionados
    private List<String> seatNumbers = new ArrayList<>();


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
    public void addSeatNumber(String seatNumber) {
        seatNumbers.add(seatNumber);
    }

    public List<String> getSeatNumbers() {
        return seatNumbers;
    }
}
