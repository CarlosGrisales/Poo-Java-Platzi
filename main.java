class main {
    public static void main(String[] args) {
        System.out.println("hola mundo");

        Car car = new Car("ABD456", new Account("carlos Grisales", "and123"));
        car.passegenger = 4;
        car.printCar();

        Car car2 = new Car("ABD455", new Account("Juan Villa", "ADF5455"));
        car2.passegenger = 3;
        car2.printCar();

        Car car3 = new Car("BAD546", new Account("Junior Rojas", "AAA123"));
        car3.passegenger = 5;
        car3.printCar();

    }
}