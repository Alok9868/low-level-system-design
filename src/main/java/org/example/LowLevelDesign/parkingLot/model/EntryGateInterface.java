package org.example.LowLevelDesign.parkingLot.model;

public interface EntryGateInterface {

    public void occupyParkingSpot(ParkingSpot parkingSpot);

    public Ticket createTicket(VehicleType vehicleType,ParkingSpot parkingSpot);

}
