package org.example.LowLevelDesign.parkingLot.model;

import lombok.Builder;
import lombok.Data;

import java.time.Duration;
import java.time.LocalDateTime;

@Data
@Builder
public class Ticket {

    private LocalDateTime entryTime;

    private LocalDateTime exitTime;

    VehicleType vehicleType;

    ParkingSpot parkingSpot;

    Integer amount;

    public Integer calculatePrice() {
        long totalTime = Duration.between(entryTime, exitTime).toMinutes();
        long totalHours = (totalTime + 59) / 60; // Round up to the next hour
        return amount = (int) (vehicleType.getPricingPerHour() * totalHours);
    }


}
