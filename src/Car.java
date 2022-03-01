public class Car {
    public enum CarType {
        TRUCK,
        VAN,
        PERSONAL,
    }

    private final String producer;
    private final String name;
    private final CarType carType;
    private final int productionYear;
    private final int mileage;
    private final String mileageDate;
    private final int ownedBy;

    public Car(String producer, String name, CarType carType, int productionYear, int mileage, String mileageDate, Person owner) {
        this.producer = producer;
        this.name = name;
        this.carType = carType;
        this.productionYear = productionYear;
        this.mileage = mileage;
        this.mileageDate = mileageDate;
        this.ownedBy = owner.getId();
    }

    public String getProducer() {
        return producer;
    }

    public String getName() {
        return name;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public int getMileage() {
        return mileage;
    }

    public String getMileageDate() {
        return mileageDate;
    }

    public int getOwnedBy() {
        return ownedBy;
    }

    public void display() {
        System.out.println("\t\t" + "Producer: " + getProducer());
        System.out.println("\t\t" + "Name: " + getName());
        System.out.println("\t\t" + "Type: " + getCarType());
        System.out.println("\t\t" + "Production year: " + getProductionYear());
        System.out.println("\t\t" + "Mileage: " + getMileage());
        System.out.println("\t\t" + "Mileage date: " + getMileageDate());
        System.out.println();
    }

    public static class Personal extends Car {
        public Personal(String producer, String name, int productionYear, int mileage, String mileageDate, Person owner) {
            super(producer, name, CarType.PERSONAL, productionYear, mileage, mileageDate, owner);
        }
    }

    public static class Van extends Car {
        public Van(String producer, String name, int productionYear, int mileage, String mileageDate, Person owner) {
            super(producer, name, CarType.VAN, productionYear, mileage, mileageDate, owner);
        }
    }

    public static class Truck extends Car {
        public Truck(String producer, String name, int productionYear, int mileage, String mileageDate, Person owner) {
            super(producer, name, CarType.TRUCK, productionYear, mileage, mileageDate, owner);
        }
    }
}

