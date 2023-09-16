import java.util.ArrayList;
import java.util.List;

public class Flight {
    private List<Seat> seats = new ArrayList<>();

     int numberOfPassengers;
    private Object lock = new Object(); // Objeto de bloqueio para exclusão mútua
    public Flight(int numSeats, int numberOfPassengers) {
        // Inicializa os assentos do voo com identificação
        for (int i = 1; i <= numSeats; i++) {
            seats.add(new Seat("Seat" + i));
        }
        this.numberOfPassengers = numberOfPassengers;
        // Embaralha a lista de assentos para que a alocação seja aleatória
       // Collections.shuffle(seats);
    }

    public boolean allocatePassengerToSeat(Passenger passenger) {
        synchronized (lock) { // Bloqueio para exclusão mútua
            // Tenta alocar o passageiro em um assento disponível
            for (Seat seat : seats) {
                if (seat.isAvailable()) {
                    if (seat.allocatePassenger(passenger)) {
                        passenger.addSeatNumber(seat.getName()); // Marca o assento selecionado pelo passageiro
                        passenger.incrementSelectedSeats(); // Incrementa o contador de assentos selecionados

                        return true;
                    }
                }
            }
            return false; // Todos os assentos estão ocupados
        }
    }

    public void simulateSeatChoiceInFlight(int numberOfPassengers) {
        for (int i = 0; i < numberOfPassengers; i++) {
            Passenger passenger = new Passenger("Passenger " + (i + 1));
            new Thread(() -> {
                while (passenger.getSelectedSeats() < 3) { // Limite de 3 assentos
                    boolean allocated = allocatePassengerToSeat(passenger);
                    if (allocated) {
                        // Passageiro alocado com sucesso
                        System.out.println(passenger.getName() + " allocated to "
                                + " seat: " + passenger.getSeatNumbers());

                        try {
                            Thread.sleep((long) (Math.random() * 5000));
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }

                    } else {
                        // Todos os assentos estão ocupados ou limite atingido
                        break;
                    }
                }
                if (passenger.getSelectedSeats() >= 3) {
                    System.out.println(passenger.getName() + " -> atingiu o limite de assentos selecionados");
                }
            }).start();
        }
    }


}
