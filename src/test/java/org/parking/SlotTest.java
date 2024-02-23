package org.parking;

import org.parking.dto.slot.SlotDTO;
import org.parking.model.slot.Slot;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.parking.model.vehicle.Vehicle;

public class SlotTest {
        private final Vehicle vehicle = new Vehicle("car", "KA-01-HH-1234", "White");
        private final Slot slot = new Slot("Car", vehicle, "123");
        private final SlotDTO slotDTO = new SlotDTO(slot);

        @Test
        public void testSlotType() {
            assertEquals("Car", slot.type());
        }
        @Test
        public void testSlotVehicle() {
            assertEquals(vehicle, slot.vehicle());
        }

}
