import java.util.*;

public class CarSystem {
    ArrayList<Person> personList = new ArrayList<>();
    ArrayList<Car> carList = new ArrayList<>();
    ArrayList<Integer> personAgeList = new ArrayList<>();
    ArrayList<Integer> carAgeList = new ArrayList<>();
    ArrayList<Integer> carMileageList = new ArrayList<>();
    Calendar calendar = Calendar.getInstance();



    public CarSystem() {
    }

    public void create() {

        Person person1 = new Person("Fredrik Wæge", 1988);
        Person person2 = new Person("Sander Jevnaker", 1996);
        Person person3 = new Person("Daniel Engelstad", 2000);
        Person person4 = new Person("Arne Arnesen", 1956);

        personList.addAll(List.of(new Person[]{person1, person2, person3, person4}));

        Car car1 = new Car.Personal("Nio", "Es8", 2021, 1239, "2021.31.12", person1);
        Car car2 = new Car.Van("Mercedes", "Vito", 2022, 321, "2022.02.17", person1);
        Car car3 = new Car.Truck("Scania", "R620", 2009, 450000, "2020.03.01", person2);
        Car car4 = new Car.Personal("Aston Martin", "DBX", 2021, 7000, "2021.11.11", person3);
        Car car5 = new Car.Truck("Volvo", "FH540", 2017, 143000, "2022.02.010", person2);
        carList.addAll(List.of(new Car[]{car1, car2, car3, car4, car5}));

        personAgeList.addAll(List.of((calendar.get(Calendar.YEAR) - person1.getBirthYear()),
                (calendar.get(Calendar.YEAR) - person2.getBirthYear()),
                (calendar.get(Calendar.YEAR) - person3.getBirthYear()),
                (calendar.get(Calendar.YEAR) - person4.getBirthYear()),
                (calendar.get(Calendar.YEAR) - person3.getBirthYear())));

        carAgeList.addAll(List.of(calendar.get(Calendar.YEAR) - car1.getProductionYear(),
                (calendar.get(Calendar.YEAR) - car2.getProductionYear()),
                (calendar.get(Calendar.YEAR) - car3.getProductionYear()),
                (calendar.get(Calendar.YEAR) - car4.getProductionYear()),
                (calendar.get(Calendar.YEAR) - car5.getProductionYear())));


        carMileageList.addAll(List.of(car1.getMileage(),
                car2.getMileage(),
                car3.getMileage(),
                car4.getMileage(),
                car5.getMileage()));
    }

    public void display() {
        for (Person person : personList) {
            person.display();
            for (Car car : carList) {
                if (car.getOwnedBy() == person.getId()) {
                    car.display();
                }
            }
        }
    }

    public void displayAverageAgePerson() {
        int averageAgePerson = (int) personAgeList.stream()
                .mapToInt(d -> d)
                .average()
                .orElse(0);

        System.out.println("\n" + "Average age of owner: " + averageAgePerson);
    }

    public void displayAverageCarAge() {
        int averageCarAge = (int) carAgeList.stream()
                .mapToInt(d -> d)
                .average()
                .orElse(0);

        System.out.println("Average car age: " + averageCarAge);
    }

    public void displayAverageCarMileage() {
        int averageCarMileage = (int) carMileageList.stream()
                .mapToInt(d -> d)
                .average()
                .orElse(0);

        System.out.println("Average car mileage: " + averageCarMileage);

    }
}
