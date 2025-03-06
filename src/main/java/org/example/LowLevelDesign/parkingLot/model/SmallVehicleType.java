package org.example.LowLevelDesign.parkingLot.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SmallVehicleType implements VehicleType {

    int pricingPerHour;

    @Override
    public int getPricingPerHour() {
        return pricingPerHour;
    }
}
