public class main {
    public static void main(String[] args) {
//        Zad1
//        Car car = new Car();
//        car.start();
//        car.stop();

//        Zad2
//        System.out.println("PRZESŁONIĘTE METODY");
//        Car car2 = new Car(5);
//        car2.start();
//        car2.stop();

//        Zad3
        Animal[] animals = {
                new Lion(),
                new Cat(),
                new Wolf(),
                new Dog()
        };

        for (Animal animal : animals) {
            animal.makeNoise();
            animal.roam();
            animal.sleep();
            System.out.println("------");
        }
   }
}
