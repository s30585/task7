public class Car extends Vehicle{
    private int numberOfSeats;
//    Zad2
    public Car(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void getNumberOfSeats() {
        numberOfSeats = numberOfSeats;
        System.out.println("Liczba miejsc w pojeździe: " + numberOfSeats);
    }
//    Zad2
    @Override
    public void start() {
        super.start();
        if(numberOfSeats > 0){
            System.out.println("Pojazd został uruchominy");
        }
    }

    @Override
    public void stop() {
        super.stop();
        if(numberOfSeats > 0){
            System.out.println("Pojazd się zatrzymał");
        }
    }
}
