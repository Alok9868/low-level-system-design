package org.example.lldparkinglot.model;

import java.util.Map;

public class ParkingLot {


    Map<Integer,Slot>slotMap;

    Integer capacity;

    public ParkingLot(Map<Integer, Slot> slotMap, Integer capacity) {
        this.slotMap = slotMap;
        this.capacity = capacity;
    }

    public void bookSlot(Car car, Integer slotNumber)
    {
        // write the logic to park the car in the slotnumber
    }


    public void freeSlot(Car car , Integer slotNumber)
    {
        // write the logic to free  the car in the slotnumber
    }






}
