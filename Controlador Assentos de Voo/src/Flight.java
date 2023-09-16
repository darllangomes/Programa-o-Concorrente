import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Flight {
    private List<Seat> seats = new ArrayList<>();
    public Flight(int numSeats) {
        // Inicializa os assentos do voo com identificação
        for (int i = 1; i <= numSeats; i++) {
            seats.add(new Seat("Seat" + i));
        }
        // Embaralha a lista de assentos para que a alocação seja aleatória
       // Collections.shuffle(seats);
    }



}
