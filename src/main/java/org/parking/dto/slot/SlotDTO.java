package org.parking.dto.slot;

import org.parking.model.slot.Slot;
import org.parking.model.vehicle.Vehicle;

public class SlotDTO {
    private String type;
    private Vehicle vehicle;
    private String tickedId;

    public SlotDTO(Slot slot) {
        this.type = slot.type();
        this.vehicle = slot.vehicle();
        this.tickedId = slot.tickedId();
    }

    public SlotDTO(String type){
        this.type = type;
    }
}
