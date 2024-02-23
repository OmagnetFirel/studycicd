package org.parking;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.parking.model.vehicle.Vehicle;

public class ParkingTest {
    private final Vehicle vehicle = new Vehicle("car", "KA-01-HH-1234", "White");

    @Test
    public void testVehicleType() {
        assertEquals("car", vehicle.type());
    }
    @Test
    public void testVehicleRegistration() {
        assertEquals("KA-01-HH-1234", vehicle.registration());
    }
    @Test
    public void testVehicleColor() {
        assertEquals("White", vehicle.color());
    }

    @Test
    public void testVehicle() {
        assertNotNull(vehicle);
        assertEquals("car", vehicle.type());
        assertEquals("KA-01-HH-1234", vehicle.registration());
        assertEquals("White", vehicle.color());
    }

}
