public class Car {

    Integer id;
    String license;
    Account driver;
    Integer passegenger;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;

    };

    void printCar() {
        System.out.println(" licences: " + license + " Name Driver: " + driver.name);
    }

}
