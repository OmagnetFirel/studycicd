package org.parking;

import org.parking.dto.slot.SlotDTO;
import org.parking.model.slot.Slot;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SlotTest {
        private final Slot slot = new Slot("Car", null, "123");
        private final SlotDTO slotDTO = new SlotDTO(slot);

        @Test
        public void testSlotType() {
            assertEquals("Car", slot.type());
        }
        @Test
        public void testSlotVehicle() {
            assertEquals(null, slot.vehicle());
        }
        @Test
        public void testSlotTickedId() {
            assertEquals("123", slot.tickedId());
        }

}
