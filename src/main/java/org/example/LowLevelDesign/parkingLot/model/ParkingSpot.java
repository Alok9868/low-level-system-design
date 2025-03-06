package org.example.LowLevelDesign.parkingLot.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ParkingSpot {

    int parkingSpotId;
    VehicleType vehicleType;
    Boolean isOccupied;

}
