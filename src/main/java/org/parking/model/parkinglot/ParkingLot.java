package org.parking.model.parkinglot;

import org.parking.dto.slot.SlotDTO;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public record ParkingLot(String id, int nfloor, int slotPerFloor) {
    private static List<List<SlotDTO>> slots = IntStream.range(0, 5)
            .mapToObj(i -> IntStream.range(0, 5)
                    .mapToObj(j -> new SlotDTO("car"))
                    .collect(Collectors.toList()))
            .toList();

    public List<List<SlotDTO>> getSlots() {
        return slots;
    }
}
