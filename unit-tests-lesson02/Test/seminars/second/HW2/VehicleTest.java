package seminars.second.HW2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    Car car;
    Motorcycle motorcycle;


    @BeforeEach
    void setUp() {
        car = new Car("Dodge", "Ram", 2010);
        motorcycle = new Motorcycle("Honda", "X5", 2020);
    }


    // Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
    @Test
    public void testCarIsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    // Проверить, что объект Car создается с 4-мя колесами.
    @Test
    public void testCarIsHaveFourWeels() {
        assertEquals(4, car.getNumWheels());
    }

    // Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    public void testMotorcycleIsHaveTwoWeels() {
        assertEquals(2, motorcycle.getNumWheels());
    }

    //Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
    @Test
    public void testCarSpeed() {
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    // Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
    @Test
    public void testMotorcycleSpeed() {
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    //Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
    @Test
    public void testCarParkSpeed() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    // Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
    @Test
    public void testMotorcycleParkSpeed() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}