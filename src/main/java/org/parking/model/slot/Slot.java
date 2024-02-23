package org.parking.model.slot;

import org.parking.model.vehicle.Vehicle;

public record Slot(String type, Vehicle vehicle, String tickedId) { }
