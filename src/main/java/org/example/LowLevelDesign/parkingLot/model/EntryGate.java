package org.example.LowLevelDesign.parkingLot.model;

import java.time.LocalDateTime;

public class EntryGate implements EntryGateInterface {

    ParkingLot parkingLot;

    @Override
    public void occupyParkingSpot(ParkingSpot parkingSpot) {

        parkingSpot.setIsOccupied(true);

    }

    @Override
    public Ticket createTicket(VehicleType vehicleType, ParkingSpot parkingSpot) {
        Ticket ticket = Ticket.builder()
                .entryTime(LocalDateTime.now())
                .vehicleType(vehicleType)
                .parkingSpot(parkingSpot)
                .amount(0)
                .build();

        return ticket;

    }
}
