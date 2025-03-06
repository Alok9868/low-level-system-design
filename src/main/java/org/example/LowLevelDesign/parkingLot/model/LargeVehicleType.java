package org.example.LowLevelDesign.parkingLot.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LargeVehicleType implements VehicleType {

    int pricingPerHour;

    @Override
    public int getPricingPerHour() {
        return pricingPerHour;
    }

}