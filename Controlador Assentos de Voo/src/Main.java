import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numSeats =  20 ; // Número de assentos
        int numberOfPassengers; // Quantidade de passageiros a serem embarcados
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter the number of passengers: ");
            numberOfPassengers = scanner.nextInt();
            if (numberOfPassengers < 0) {
                System.out.println("Number of passengers cannot be negative.");
            }
        } while (numberOfPassengers < 0);

        Flight flight = new Flight(numSeats, numberOfPassengers);
        flight.simulateSeatChoiceInFlight(numberOfPassengers);

    }
}